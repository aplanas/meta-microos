SUMMARY = "SNMP SMI/MIB Parser"
DESCRIPTION = "A pure-Python implementation of SNMP/SMI MIB parsing and conversion library. \
Can produce PySNMP MIB modules. \
 \
Documentation: http://pysmi.sf.net"
LICENSE = "BSD-2-Clause"

PV = "0.3.4"

RPM_NAME = "python311-pysmi-0.3.4-3.11.noarch.rpm"
RPM_HASH = "e25290c5c89564e6a26ed7b29a8839706f4aee682c2c023ca038ea7505317bbafde0d744724e1642881a39dfca95de70059e9bb44e606ee7af27bbbd918cb8b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pysmi \
python3.11dist-pysmi \
python311-pysmi \
python3dist-pysmi"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-ply"

inherit rpm
