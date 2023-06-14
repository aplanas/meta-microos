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

RPM_NAME = "python39-pysnmp-4.4.12-2.13.noarch.rpm"
RPM_HASH = "c62468c830ca38c60cbfcea82b27d3cec19e665903b433f6b65f192c4d4c8f20c49e9af28af8a2e25f6209ad7b560406830f75f6f7c8644e5c274f286d0a72de"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pysnmp \
python39-pysnmp \
python3dist-pysnmp"

RDEPENDS:${PN} += "python-abi \
python39-pyasn1 \
python39-pycryptodome \
python39-pysmi"

inherit rpm
