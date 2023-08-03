SUMMARY = "An OBS source service: create tar ball from svn/git/hg"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
It supports downloading from svn, git, hg and bzr repositories."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.41"

RPM_NAME = "obs-service-tar_scm-0.10.41-1.1.noarch.rpm"
RPM_HASH = "9fb745007acf2ab3035153b5498ece9abe08c96110628545ac4a9b4e4a34bb626b365396637afe873a552d2a64a5d6f27e39da49ed62a85bab6fb1aa0aa2abb0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-tar-scm"

RDEPENDS:${PN} += "/usr/bin/python3 \
git-core \
obs-service-obs-scm-common"

inherit rpm
