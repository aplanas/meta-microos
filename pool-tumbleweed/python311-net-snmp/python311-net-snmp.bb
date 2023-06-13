SUMMARY = "The Python 3 'netsnmp' module for the Net-SNMP"
DESCRIPTION = "The 'netsnmp' module provides a full featured, tri-lingual SNMP (SNMPv3, \
SNMPv2c, SNMPv1) client API. The 'netsnmp' module internals rely on the \
Net-SNMP toolkit library."
LICENSE = "BSD-3-Clause & MIT"

PV = "5.9.3"

RPM_NAME = "python311-net-snmp-5.9.3-4.6.aarch64.rpm"
RPM_HASH = "c5d38554a0e73cc4889d804eda9e68967f39ef8d6ef023dbc4c3643f1a72b262d5410781fcb9c46c332be5d7bc4e7754d84045e3821aced22ee742a4e823c034"

RPROVIDES:${PN} += "python3.11dist(netsnmp-python) \
python311-net-snmp \
python311-net-snmp(aarch-64) \
python3dist(netsnmp-python)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libnetsnmp.so.40()(64bit) \
libsnmp40 \
python(abi)"

inherit rpm
