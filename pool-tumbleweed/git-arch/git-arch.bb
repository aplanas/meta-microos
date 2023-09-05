SUMMARY = "Git tools for importing Arch repositories"
DESCRIPTION = "Tools for importing GNU Arch repositories to the GIT version control \
system."
LICENSE = "GPL-2.0-only"

PV = "2.42.0"

RPM_NAME = "git-arch-2.42.0-1.1.aarch64.rpm"
RPM_HASH = "bece0c0a33c088f71bbfecb726cee413dc0826448851577bdaa8e91df89f02e52e12f54d13b0bfbba522609db9c99ebebe39d8c763dfaa6806c5866c710a5444"

RPROVIDES:${PN} += "git-arch"

RDEPENDS:${PN} += "/usr/bin/perl \
git-core"

inherit rpm
