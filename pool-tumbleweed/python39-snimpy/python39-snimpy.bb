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

RPM_NAME = "python39-snimpy-1.0.1-1.1.aarch64.rpm"
RPM_HASH = "dc92a5f9573333e0ef958ba2c8f81d31ae0d5c8cbf64b03424c8fbcd5b72661e5398366960f1e9c07c1c75d93a6dc887847dee3dd1fd8a012df2e6f84e0d0869"

RPROVIDES:${PN} += "python3.9dist-snimpy \
python39-snimpy \
python3dist-snimpy"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsmi.so.2 \
python-abi \
python39-cffi \
python39-pysnmp \
python39-setuptools \
update-alternatives"

inherit rpm
