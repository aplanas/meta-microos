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

RPM_NAME = "python310-pysnmp-4.4.12-2.15.noarch.rpm"
RPM_HASH = "245a1502ef0365afe8d7697eea159d8f8fd8c649a51867edd32ab3de961500c55ba0e69fe3fa15d7974852fa280aa0606fb1c5be84b0e98e673d069ae98512fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pysnmp \
python310-pysnmp \
python3dist-pysnmp"

RDEPENDS:${PN} += "python-abi \
python310-pyasn1 \
python310-pycryptodome \
python310-pysmi"

inherit rpm
