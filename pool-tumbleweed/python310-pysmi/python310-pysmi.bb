SUMMARY = "SNMP SMI/MIB Parser"
DESCRIPTION = "A pure-Python implementation of SNMP/SMI MIB parsing and conversion library. \
Can produce PySNMP MIB modules. \
 \
Documentation: http://pysmi.sf.net"
LICENSE = "BSD-2-Clause"

PV = "0.3.4"

RPM_NAME = "python310-pysmi-0.3.4-3.11.noarch.rpm"
RPM_HASH = "0c1ac110e22820e9adc790ae0f318adeb6186efcbbae2381573936319c7c9591fbe2f70b897c5e4c518a636750c70d2ce84e56f79c46c958ec8b6430a8100604"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pysmi \
python310-pysmi \
python3dist-pysmi"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-ply"

inherit rpm
