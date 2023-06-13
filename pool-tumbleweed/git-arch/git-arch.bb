SUMMARY = "Git tools for importing Arch repositories"
DESCRIPTION = "Tools for importing GNU Arch repositories to the GIT version control \
system."
LICENSE = "GPL-2.0-only"

PV = "2.40.1"

RPM_NAME = "git-arch-2.40.1-1.1.aarch64.rpm"
RPM_HASH = "c66d6154b8860629c618a0f3d9ed7f668ec3270407d95a7c24cf46b507f1203d347f500053da3966c5c59e465f37040f35b2ffc9c7e9dd08d56cc40e47d87c23"

RPROVIDES:${PN} += "git-arch \
git-arch(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/perl \
git-core"

inherit rpm
