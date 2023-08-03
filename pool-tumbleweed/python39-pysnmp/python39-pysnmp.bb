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

RPM_NAME = "python39-pysnmp-5.0.28-1.1.noarch.rpm"
RPM_HASH = "4b1dc4929513da4c5571d02c008f00f11128fcf4f4ac1926ae7e722f2619dc5a5e0c9b75641898d30f45a5688ff23431c1b02a95d068a5525e6e1200beb990cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pysnmp-lextudio \
python39-pysnmp \
python3dist-pysnmp-lextudio"

RDEPENDS:${PN} += "python-abi \
python39-pyasn1 \
python39-pysmi \
python39-pysnmpcrypto"

inherit rpm
