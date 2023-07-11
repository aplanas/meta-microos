SUMMARY = "Common parts of SCM handling services"
DESCRIPTION = "This is a source service for openSUSE Build Service. \
 \
It supports downloading from svn, git, hg and bzr repositories. \
 \
This package holds the shared files for different services."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.39"

RPM_NAME = "obs-service-obs_scm-common-0.10.39-1.1.noarch.rpm"
RPM_HASH = "679007d252969686d18fcb885ce0af295ce939cdbccad34e3c7b937a61717ef13f0f661a3aee3fa084753daa66b4e4c6bd6140636031567f625af504ee080e17"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-obs-service-obs-scm-common \
obs-service-obs-scm-common"

RDEPENDS:${PN} += "/usr/bin/python3 \
glibc-locale-base \
python3-PyYAML \
python3-dateutil"

inherit rpm
