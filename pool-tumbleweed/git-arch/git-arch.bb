SUMMARY = "Git tools for importing Arch repositories"
DESCRIPTION = "Tools for importing GNU Arch repositories to the GIT version control \
system."
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "git-arch-2.41.0-1.3.aarch64.rpm"
RPM_HASH = "2d76c3d7973cc44b61eac4620b492a9db105f12254941978ab945aa6fac46e34113d585cf3d21b1d1be90dbf978672f7280c0b269430a58ca79cb05c97d2bed6"

RPROVIDES:${PN} += "git-arch"

RDEPENDS:${PN} += "/usr/bin/perl \
git-core"

inherit rpm
