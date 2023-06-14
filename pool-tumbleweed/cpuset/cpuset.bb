SUMMARY = "Cpuset manipulation tool"
DESCRIPTION = "Cpuset is a Python application for using the cpuset facilities in \
the Linux kernel. The actual included command is called cset \
and allows manipulation of cpusets on the system, and provides higher \
level functions such as implementation and control of a basic CPU \
shielding setup."
LICENSE = "GPL-2.0-only"

PV = "1.6"

RPM_NAME = "cpuset-1.6-3.6.noarch.rpm"
RPM_HASH = "452bda8067e6463068cca1ef104e609401b896d2b662a404be16af0879da0b48fff65cc4a9e3346c84a9a23c8f72e6d199ad200b906ce58e6aad62443d74d3a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cpuset \
python3.10dist-cpuset \
python3dist-cpuset"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-future"

inherit rpm
