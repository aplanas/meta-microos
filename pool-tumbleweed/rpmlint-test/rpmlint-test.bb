SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230713.dfa31c7"

RPM_NAME = "rpmlint-test-2.4.0+git20230713.dfa31c7-1.1.noarch.rpm"
RPM_HASH = "10debde8ceda3ef832ca7f3450a190da1a349546bf0a0db667a9d93866f89838b1bbff13a4ec9e264a226dd7c76c32951a13ecab2b93156d82b1d740d0cc016f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpmlint-test"

RDEPENDS:${PN} += ""

inherit rpm
