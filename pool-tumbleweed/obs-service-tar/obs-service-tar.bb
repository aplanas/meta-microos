SUMMARY = "Creates a tar archive from local directory"
DESCRIPTION = "Creates a tar archive from local directory"
LICENSE = "GPL-2.0-or-later"

PV = "0.10.36"

RPM_NAME = "obs-service-tar-0.10.36-1.1.noarch.rpm"
RPM_HASH = "1d2a8214c4e407fa9758af4aeca1c91a3efd85ae5272231e56c6cb863e3d85d37b9d6d2fd86d26e5c4886475506310cf459307becdbe67aa7d652d0fb5ce75c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-tar \
obs-service-tar_scm:/usr/lib/obs/service/tar.service"

RDEPENDS:${PN} += "obs-service-obs_scm-common"

inherit rpm
