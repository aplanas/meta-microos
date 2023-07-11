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

RPM_NAME = "python39-pysnmp-4.4.12-2.15.noarch.rpm"
RPM_HASH = "ce72e6d3a236f8283175ed0f01385d9dda64b2af7715dc89fe9e22ca405d36a338eff87dd1142af7dbdd25b5164446366de71150551d5ace56f82d3ea444ec78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pysnmp \
python39-pysnmp \
python3dist-pysnmp"

RDEPENDS:${PN} += "python-abi \
python39-pyasn1 \
python39-pycryptodome \
python39-pysmi"

inherit rpm
