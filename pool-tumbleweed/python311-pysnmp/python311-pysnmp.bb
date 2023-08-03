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

RPM_NAME = "python311-pysnmp-5.0.28-1.1.noarch.rpm"
RPM_HASH = "cba5d4ffd05c292fcdfa02dc6684416bf1e978d6e2e1c21ed515bdfe5430c14bc2222c804712e0b97b68773188f919a6228137ce54d0c3b1be376b9477f67a56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysnmp \
python3.11dist-pysnmp-lextudio \
python311-pysnmp \
python3dist-pysnmp-lextudio"

RDEPENDS:${PN} += "python-abi \
python311-pyasn1 \
python311-pysmi \
python311-pysnmpcrypto"

inherit rpm
