SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230818.5cdd21d0"

RPM_NAME = "rpmlint-strict-2.4.0+git20230818.5cdd21d0-1.1.noarch.rpm"
RPM_HASH = "db7cf1b1948aea371c3c00beda6ec1e529d18de34bdf80ff89dc6a03d730eab9fbaa02759529a5132be71ed81bd2423c728f4d6423d489940618358b25212fd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-rpmlint-strict \
rpmlint-strict"

RDEPENDS:${PN} += ""

inherit rpm
