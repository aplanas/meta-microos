SUMMARY = "The Python 3 'netsnmp' module for the Net-SNMP"
DESCRIPTION = "The 'netsnmp' module provides a full featured, tri-lingual SNMP (SNMPv3, \
SNMPv2c, SNMPv1) client API. The 'netsnmp' module internals rely on the \
Net-SNMP toolkit library."
LICENSE = "BSD-3-Clause & MIT"

PV = "5.9.3"

RPM_NAME = "python310-net-snmp-5.9.3-4.6.aarch64.rpm"
RPM_HASH = "bc7e0250207f69375f0fb1dfa76a4dfa8f9628e2561478355c84f792b6be2da7ff7d6b7caf7d6c27a6e66109fef6b1a4f6b04d740c64698a3939a0487b569f4f"

RPROVIDES:${PN} += "python3-net-snmp \
python3.10dist(netsnmp-python) \
python310-net-snmp \
python310-net-snmp(aarch-64) \
python3dist(netsnmp-python)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libnetsnmp.so.40()(64bit) \
libsnmp40 \
python(abi)"

inherit rpm
