SUMMARY = "The Python 3 'netsnmp' module for the Net-SNMP"
DESCRIPTION = "The 'netsnmp' module provides a full featured, tri-lingual SNMP (SNMPv3, \
SNMPv2c, SNMPv1) client API. The 'netsnmp' module internals rely on the \
Net-SNMP toolkit library."
LICENSE = "BSD-3-Clause & MIT"

PV = "5.9.3"

RPM_NAME = "python311-net-snmp-5.9.3-4.10.aarch64.rpm"
RPM_HASH = "3135b317a3752fccf50da9ec90b9ae638c0e79836d70a57dc8a95afc3b16d517940d8b98ca89499d1b7daaab0c15175b1522a6e6c9ae554b584f36e44da080ad"

RPROVIDES:${PN} += "python3-net-snmp \
python3.11dist-netsnmp-python \
python311-net-snmp \
python3dist-netsnmp-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.40 \
libsnmp40 \
python-abi"

inherit rpm
