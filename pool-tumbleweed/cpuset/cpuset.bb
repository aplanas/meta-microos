SUMMARY = "Cpuset manipulation tool"
DESCRIPTION = "Cpuset is a Python application for using the cpuset facilities in \
the Linux kernel. The actual included command is called cset \
and allows manipulation of cpusets on the system, and provides higher \
level functions such as implementation and control of a basic CPU \
shielding setup."
LICENSE = "GPL-2.0-only"

PV = "1.6"

RPM_NAME = "cpuset-1.6-3.7.noarch.rpm"
RPM_HASH = "2198b0deb5f4d0a40ba56ea04f9b9f2be9f180c397fa900cc542cc53bb25c3730cec9ae5e4a7d5926f53230d755a93771e2314174fc5be6e094fbef01d32c266"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpuset \
python3.11dist-cpuset \
python3dist-cpuset"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-future"

inherit rpm
