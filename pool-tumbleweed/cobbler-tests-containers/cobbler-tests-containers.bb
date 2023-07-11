SUMMARY = "Dockerfiles and scripts to setup testing containers"
DESCRIPTION = "Dockerfiles and scripts to setup testing containers"
LICENSE = "GPL-2.0-or-later"

PV = "3.3.3"

RPM_NAME = "cobbler-tests-containers-3.3.3-1.2.noarch.rpm"
RPM_HASH = "69586a3d43bf258b35eaf02815cc76d919d7948de587b959ce6ad6262ab660b03f09802ee389aece4a854dd50e84b18e5d057caff22b28547c8b9acca23f05ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cobbler-tests-containers"

RDEPENDS:${PN} += "/usr/bin/bash \
cobbler"

inherit rpm
