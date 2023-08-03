SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230727.0fd5122"

RPM_NAME = "rpmlint-test-2.4.0+git20230727.0fd5122-1.1.noarch.rpm"
RPM_HASH = "e725540b5992744b59de2c4d8fcc6111e9cf618b3962ac2ac0cb02481902957dbbf944bcd1f34231d8346b6b6914e339dbe4711a4261c6ae5df8f4812929c0cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpmlint-test"

RDEPENDS:${PN} += ""

inherit rpm
