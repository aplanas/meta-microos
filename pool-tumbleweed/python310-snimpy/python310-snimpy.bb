SUMMARY = "Interactive SNMP tool"
DESCRIPTION = "Snimpy is a Python-based tool providing a simple interface to build \
SNMP query. You can either use Snimpy interactively through its console \
(derived from Python own console or from IPython_ if available) or write \
Snimpy scripts which are just Python scripts with some global variables \
available. \
 \
Snimpy is aimed at being the more Pythonic possible. You should forget \
that you are doing SNMP requests. Snimpy will rely on MIB to hide SNMP \
details. Here are some 'features': \
 \
 * MIB parser based on libsmi  (through CFFI) \
 * SNMP requests are handled by PySNMP (SNMPv1, SNMPv2 and SNMPv3 \
   support) \
 * scalars are just attributes of your session object \
 * columns are like a Python dictionary and made available as an \
   attribute \
 * getting an attribute is like issuing a GET method \
 * setting an attribute is like issuing a SET method \
 * iterating over a table is like using GETNEXT \
 * when something goes wrong, you get an exception"
LICENSE = "ISC"

PV = "1.0.1"

RPM_NAME = "python310-snimpy-1.0.1-1.1.aarch64.rpm"
RPM_HASH = "7938ce9939210715bb11a4b60f9205161412ff8d0b32370009c1219e26bcf0c13b618ec3d21c43d65d42655d9ee03655257508f4b38715e138bd4fdfd5dfcabc"

RPROVIDES:${PN} += "python3.10dist-snimpy \
python310-snimpy \
python3dist-snimpy"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsmi.so.2 \
python-abi \
python310-cffi \
python310-pysnmp \
python310-setuptools \
update-alternatives"

inherit rpm
