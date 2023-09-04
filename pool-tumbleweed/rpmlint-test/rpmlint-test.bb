SUMMARY = "RPM file correctness checker"
DESCRIPTION = "rpmlint is a tool to check common errors on RPM packages. Binary and \
source packages can be checked."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.0+git20230818.5cdd21d0"

RPM_NAME = "rpmlint-test-2.4.0+git20230818.5cdd21d0-1.1.noarch.rpm"
RPM_HASH = "a9811485591d9a8db20cb657ec987b6c441384721867da1594c9561821407f7d093d49ec2d27ec257aa01941541900f91b24395e8fbdf0d88bac158711bd5c94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rpmlint-test"

RDEPENDS:${PN} += ""

inherit rpm
