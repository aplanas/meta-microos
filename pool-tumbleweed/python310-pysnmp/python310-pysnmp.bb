SUMMARY = "A pure-Python SNMPv1/v2c/v3 library"
DESCRIPTION = "This project is a SNMP v1/v2c/v3 engine written in the Python \
programming language. \
 \
    * Complete SNMPv1/v2c and SNMPv3 engine support \
    * Can act as Manager and/or Agent \
    * Manager and Agent side MIB support \
    * Asynchronous operations support \
    * Pure-Python implementation \
    * py2exe and .egg friendly \
    * Twisted binding"
LICENSE = "BSD-2-Clause"

PV = "5.0.28"

RPM_NAME = "python310-pysnmp-5.0.28-1.1.noarch.rpm"
RPM_HASH = "087b1729e68a73e1c6417012d990d034e844db43441737ef3cd9b8f9acdee86ba9e131d4763c7c0c0bdfc42b97480f02ccac5f9c338ff39bfd6a56a1b338d057"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pysnmp-lextudio \
python310-pysnmp \
python3dist-pysnmp-lextudio"

RDEPENDS:${PN} += "python-abi \
python310-pyasn1 \
python310-pysmi \
python310-pysnmpcrypto"

inherit rpm
