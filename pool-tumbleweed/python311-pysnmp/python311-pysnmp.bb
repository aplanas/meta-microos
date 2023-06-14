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

PV = "4.4.12"

RPM_NAME = "python311-pysnmp-4.4.12-2.13.noarch.rpm"
RPM_HASH = "1179226c3a940d7c7e770e8546568e58339572ddbde73d75cae371a36835737fcd6385ee5bbd358850e0eab1e2c3b2b3dcb41f7c4ddee72b46428aa15e9be330"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pysnmp \
python311-pysnmp \
python3dist-pysnmp"

RDEPENDS:${PN} += "python-abi \
python311-pyasn1 \
python311-pycryptodome \
python311-pysmi"

inherit rpm
