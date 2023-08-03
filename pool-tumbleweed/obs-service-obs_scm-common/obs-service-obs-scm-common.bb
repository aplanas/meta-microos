SUMMARY = "Common parts of SCM handling services"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
It supports downloading from svn, git, hg and bzr repositories. \
 \
This package holds the shared files for different services."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.41"

RPM_NAME = "obs-service-obs_scm-common-0.10.41-1.1.noarch.rpm"
RPM_HASH = "93e05c65a7c9c0e014e419032666e4783d3f4dc52ac2cb72fbfc8c1716935b853288347c28e31edb4549c970be1e14c53e56500ac85db0cabb717dedb88e32d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-obs-service-obs-scm-common \
obs-service-obs-scm-common"

RDEPENDS:${PN} += "/usr/bin/python3 \
glibc-locale-base \
python3-PyYAML \
python3-dateutil"

inherit rpm
