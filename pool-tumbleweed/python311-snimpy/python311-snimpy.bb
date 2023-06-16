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

PV = "1.0.0"

RPM_NAME = "python311-snimpy-1.0.0-2.7.aarch64.rpm"
RPM_HASH = "df8cdcab078bb4322e17fa31db603c2e1970ef2cf2c4a0f16aba8b193f0550e597638ce8a4940e8e7e0c87c842de4c368d01b8b0219f34328542c53992fbced3"

RPROVIDES:${PN} += "python3.11dist-snimpy \
python311-snimpy \
python3dist-snimpy"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libsmi.so.2 \
python-abi \
python311-cffi \
python311-pycryptodomex \
python311-pysnmp \
python311-setuptools \
update-alternatives"

inherit rpm
