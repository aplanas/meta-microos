SUMMARY = "SNMP SMI/MIB Parser"
DESCRIPTION = "A pure-Python implementation of SNMP/SMI MIB parsing and conversion library. \
Can produce PySNMP MIB modules. \
 \
Documentation: http://pysmi.sf.net"
LICENSE = "BSD-2-Clause"

PV = "0.3.4"

RPM_NAME = "python311-pysmi-0.3.4-3.9.noarch.rpm"
RPM_HASH = "905fe1780de019b80d361df5da3b4b2b043f1bf81d999689f2abffb6d27773b1df6fe48927e318e3ca28a6a506e7f3409060c6018e7d4075660ef9a6d94ab201"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(pysmi) \
python311-pysmi \
python3dist(pysmi)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
alts \
python(abi) \
python311-ply"

inherit rpm
