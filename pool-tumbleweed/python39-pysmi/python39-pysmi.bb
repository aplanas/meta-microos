SUMMARY = "SNMP SMI/MIB Parser"
DESCRIPTION = "A pure-Python implementation of SNMP/SMI MIB parsing and conversion library. \
Can produce PySNMP MIB modules. \
 \
Documentation: http://pysmi.sf.net"
LICENSE = "BSD-2-Clause"

PV = "0.3.4"

RPM_NAME = "python39-pysmi-0.3.4-3.9.noarch.rpm"
RPM_HASH = "5add7f449067c014be1f997a0bb811cc3aeb3435a26788bdf86270dfa1c7ed7b1b67ad0a43c1e372d9655ddd898e7e1ade15223aded3120484dfa8eb2afb66d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pysmi) \
python39-pysmi \
python3dist(pysmi)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
alts \
python(abi) \
python39-ply"

inherit rpm
