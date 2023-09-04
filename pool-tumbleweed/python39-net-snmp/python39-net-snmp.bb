SUMMARY = "The Python 3 'netsnmp' module for the Net-SNMP"
DESCRIPTION = "The 'netsnmp' module provides a full featured, tri-lingual SNMP (SNMPv3, \
SNMPv2c, SNMPv1) client API. The 'netsnmp' module internals rely on the \
Net-SNMP toolkit library."
LICENSE = "BSD-3-Clause & MIT"

PV = "5.9.3"

RPM_NAME = "python39-net-snmp-5.9.3-4.11.aarch64.rpm"
RPM_HASH = "1085c7aa618775a6f23b6339cb48f7f1471da026e853ae044dff6318b2cc45f763a303b8a0aeae3d49cdc807e538092a676736b0ba3d84005402bb743780bf98"

RPROVIDES:${PN} += "python3.9dist-netsnmp-python \
python39-net-snmp \
python3dist-netsnmp-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.40 \
libsnmp40 \
python-abi"

inherit rpm
