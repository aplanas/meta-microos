SUMMARY = "Git tools for importing Arch repositories"
DESCRIPTION = "Tools for importing GNU Arch repositories to the GIT version control \
system."
LICENSE = "GPL-2.0-only"

PV = "2.41.0"

RPM_NAME = "git-arch-2.41.0-1.2.aarch64.rpm"
RPM_HASH = "cea2b358554ca8ee20b4886149eefcc234d195c51d665dfc6990570e250ecbcc17ff344e7352a84acef953d3d2532f8a0df5ad2688cf4f943db2d8063cc8fcbf"

RPROVIDES:${PN} += "git-arch"

RDEPENDS:${PN} += "/usr/bin/perl \
git-core"

inherit rpm
