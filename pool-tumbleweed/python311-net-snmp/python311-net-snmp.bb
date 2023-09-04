SUMMARY = "The Python 3 'netsnmp' module for the Net-SNMP"
DESCRIPTION = "The 'netsnmp' module provides a full featured, tri-lingual SNMP (SNMPv3, \
SNMPv2c, SNMPv1) client API. The 'netsnmp' module internals rely on the \
Net-SNMP toolkit library."
LICENSE = "BSD-3-Clause & MIT"

PV = "5.9.3"

RPM_NAME = "python311-net-snmp-5.9.3-4.11.aarch64.rpm"
RPM_HASH = "43571486db6df302e71b262a8c096d5bf9366723cb07584aadd8f12f89d349b91ca49c8eecce35fac1804e63662e1582fa58725bd59d912bf555ea519891b669"

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
