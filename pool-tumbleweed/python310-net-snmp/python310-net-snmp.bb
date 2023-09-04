SUMMARY = "The Python 3 'netsnmp' module for the Net-SNMP"
DESCRIPTION = "The 'netsnmp' module provides a full featured, tri-lingual SNMP (SNMPv3, \
SNMPv2c, SNMPv1) client API. The 'netsnmp' module internals rely on the \
Net-SNMP toolkit library."
LICENSE = "BSD-3-Clause & MIT"

PV = "5.9.3"

RPM_NAME = "python310-net-snmp-5.9.3-4.11.aarch64.rpm"
RPM_HASH = "b77cd23707e6880e8879ab0bb3a8ee1a5197a44a61cc076d70e43e86b1d2171a46884ce9c512d7d5bac472ede25bac08c480be924f1da88caeff6b7d24663896"

RPROVIDES:${PN} += "python3.10dist-netsnmp-python \
python310-net-snmp \
python3dist-netsnmp-python"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libnetsnmp.so.40 \
libsnmp40 \
python-abi"

inherit rpm
