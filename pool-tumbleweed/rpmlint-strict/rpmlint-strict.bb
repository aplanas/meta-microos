SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230713.dfa31c7"

RPM_NAME = "rpmlint-strict-2.4.0+git20230713.dfa31c7-1.1.noarch.rpm"
RPM_HASH = "84d4ae217a6db64cf2172ec9c73be1988645b1e6f0cfe5f91421daecc1258f3afcaf7c5ee54175d2d6ad8d85acbe0994b524bbe137747f7de7569e6fdeabe183"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-rpmlint-strict \
rpmlint-strict"

RDEPENDS:${PN} += ""

inherit rpm
