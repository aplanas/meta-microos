SUMMARY = "SNMP SMI/MIB Parser"
DESCRIPTION = "A pure-Python implementation of SNMP/SMI MIB parsing and conversion library. \
Can produce PySNMP MIB modules. \
 \
Documentation: http://pysmi.sf.net"
LICENSE = "BSD-2-Clause"

PV = "0.3.4"

RPM_NAME = "python39-pysmi-0.3.4-3.11.noarch.rpm"
RPM_HASH = "74e91b0affc9e11f81cddb8b0b55453fe681131627108fcfe2a35709b2a2fcd482fedf8a21ae30e8e73e11472943e6791718b7dbb12d1dbe807c4d319c4827dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pysmi \
python39-pysmi \
python3dist-pysmi"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39-ply"

inherit rpm
