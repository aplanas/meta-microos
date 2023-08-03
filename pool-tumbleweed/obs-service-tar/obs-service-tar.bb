SUMMARY = "Creates a tar archive from local directory"
DESCRIPTION = "Creates a tar archive from local directory"
LICENSE = "GPL-2.0-or-later"

PV = "0.10.41"

RPM_NAME = "obs-service-tar-0.10.41-1.1.noarch.rpm"
RPM_HASH = "9741658b93507c68ff9538f6986ccf7ea4f1f293cec7f09f0b871ad65d1167244991a7dba252d26a9c6c0788563ec6ddb3b54bc4d852d9c4d3071c4d4df97eb9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-tar \
obs-service-tar-scm-/usr/lib/obs/service/tar.service"

RDEPENDS:${PN} += "obs-service-obs-scm-common"

inherit rpm
