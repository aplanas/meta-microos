SUMMARY = "Common parts of SCM handling services"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
It supports downloading from svn, git, hg and bzr repositories. \
 \
This package holds the shared files for different services."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.36"

RPM_NAME = "obs-service-obs_scm-common-0.10.36-1.1.noarch.rpm"
RPM_HASH = "1a38871b69c80c4f1172b712ed509a75dedb3fdef5f6ea2635460a5a01240e7f8bd764f1f9f6d72303f03aa1497fbf3d0faa45d56ad62da6e8421dad15b09814"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-obs-service-obs-scm-common \
obs-service-obs-scm-common"

RDEPENDS:${PN} += "/usr/bin/python3 \
glibc-locale-base \
python3-PyYAML \
python3-dateutil"

inherit rpm
