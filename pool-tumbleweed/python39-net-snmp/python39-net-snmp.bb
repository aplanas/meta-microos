SUMMARY = "The Python 3 'netsnmp' module for the Net-SNMP"
DESCRIPTION = "The 'netsnmp' module provides a full featured, tri-lingual SNMP (SNMPv3, \
SNMPv2c, SNMPv1) client API. The 'netsnmp' module internals rely on the \
Net-SNMP toolkit library."
LICENSE = "BSD-3-Clause & MIT"

PV = "5.9.3"

RPM_NAME = "python39-net-snmp-5.9.3-4.6.aarch64.rpm"
RPM_HASH = "31f8e5445ef39ccd5265fac55c85871bcd624e2b8b94449633f5ac4ea5ed3b5e0530f0afe6ad43d7be8acb52f88f5ee8f2d2bd99821e358de0362ba28aad1391"

RPROVIDES:${PN} += "python3.9dist(netsnmp-python) \
python39-net-snmp \
python39-net-snmp(aarch-64) \
python3dist(netsnmp-python)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libnetsnmp.so.40()(64bit) \
libsnmp40 \
python(abi)"

inherit rpm
