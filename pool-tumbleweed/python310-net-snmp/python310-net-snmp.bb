SUMMARY = "The Python 3 'netsnmp' module for the Net-SNMP"
DESCRIPTION = "The 'netsnmp' module provides a full featured, tri-lingual SNMP (SNMPv3, \
SNMPv2c, SNMPv1) client API. The 'netsnmp' module internals rely on the \
Net-SNMP toolkit library."
LICENSE = "BSD-3-Clause & MIT"

PV = "5.9.3"

RPM_NAME = "python310-net-snmp-5.9.3-4.10.aarch64.rpm"
RPM_HASH = "f5a5a8212a095613cedf7167d34a43f9e5206e7d68b7e852d4ff26e0c04dec9944204fe10500655ca50bf9626db8fb254b4c67d02c28ee93f87841bda37e8a0b"

RPROVIDES:${PN} += "python3.10dist-netsnmp-python \
python310-net-snmp \
python3dist-netsnmp-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.40 \
libsnmp40 \
python-abi"

inherit rpm
