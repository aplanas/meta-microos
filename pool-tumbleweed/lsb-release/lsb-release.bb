SUMMARY = "Linux Standard Base Release Tools"
DESCRIPTION = "Tools from the Linux Standard Base project to determine the used distribution"
LICENSE = "GPL-2.0-or-later"

PV = "3.2"

RPM_NAME = "lsb-release-3.2-3.1.noarch.rpm"
RPM_HASH = "a410fd38ec81d22e2c33bea2036ce8c07e0cdec49004c9672d33d016ed2bf4c6c5d80e0e268328841d78769bc7df25a9ba61dfc95becd3cce6b4f1d595167f5e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lsb-release"

RDEPENDS:${PN} += "/usr/bin/sh \
util-linux"

inherit rpm
