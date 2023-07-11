SUMMARY = "An OBS source service: create tar ball from svn/git/hg"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
It supports downloading from svn, git, hg and bzr repositories."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.39"

RPM_NAME = "obs-service-tar_scm-0.10.39-1.1.noarch.rpm"
RPM_HASH = "4551d20505fb7cef95b975fd28d5b12eafa97b4a6b8f3bb1c834aa0cba05a310c91c25b78533d3b917823205cfeb2f5be4cf0a06150c60caf38a702f5ffedc68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-tar-scm"

RDEPENDS:${PN} += "/usr/bin/python3 \
git-core \
obs-service-obs-scm-common"

inherit rpm
