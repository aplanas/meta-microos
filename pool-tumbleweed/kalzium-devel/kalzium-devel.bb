SUMMARY = "Periodic Table of Elements"
DESCRIPTION = "Kalzium shows a periodic table of the elements."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kalzium-devel-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "7ec7c6ae9665e7724c24637e1a22a6a421a03204537fc59be0e9f7ef3cf8c97d67debed8faa8f9a415deb4411819e949357ede9e04e2ad8444a89810ae4e4d17"

RPROVIDES:${PN} += "kalzium-devel \
kalzium-devel(aarch-64)"
RDEPENDS:${PN} += "kalzium"

inherit rpm
