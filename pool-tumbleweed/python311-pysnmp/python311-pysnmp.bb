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

RPM_NAME = "python311-pysnmp-4.4.12-2.15.noarch.rpm"
RPM_HASH = "c2d1381dd14920f2358a7b07e05982d3339200d71a6a2c2e93d5572a3db46a1647d87347980e0b11f5d0ccf6b331a8ac4b33407f5452e5c85105f5e9969fb5e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysnmp \
python3.11dist-pysnmp \
python311-pysnmp \
python3dist-pysnmp"

RDEPENDS:${PN} += "python-abi \
python311-pyasn1 \
python311-pycryptodome \
python311-pysmi"

inherit rpm
