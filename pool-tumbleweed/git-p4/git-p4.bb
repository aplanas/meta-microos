SUMMARY = "Git tools for importing Perforce repositories"
DESCRIPTION = "Tools for importing Perforce repositories to the GIT version control \
system."
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "git-p4-2.41.0-1.2.aarch64.rpm"
RPM_HASH = "0bb499e2991a224fd2b0c3c21d5631a8520428d35f82030dfba0e48b81536a400f11bafbf96b271d4f80b999095a83bd026afe2ba298b93e9e3e7e51ac29e956"

RPROVIDES:${PN} += "git-p4"

RDEPENDS:${PN} += "/usr/bin/python3 \
git-core"

inherit rpm
