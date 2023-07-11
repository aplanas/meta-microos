SUMMARY = "Creates a OBS cpio from a remote SCM resource"
DESCRIPTION = "Creates a OBS cpio from a remote SCM resource. \
 \
This can be used to work directly in local git checkout and can be packaged \
into a tar ball during build time."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.39"

RPM_NAME = "obs-service-obs_scm-0.10.39-1.1.noarch.rpm"
RPM_HASH = "877b5d198f810e62a80374005aeb4a2500fba1e1def4f1e49c9a1e1a6ab097ca267c731879c1144af2ada500734d3d5ed96316ba863542fe477b799601a5c584"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-obs-scm \
obs-service-tar-scm-/usr/lib/obs/service/obs-scm.service"

RDEPENDS:${PN} += "git-core \
obs-service-obs-scm-common"

inherit rpm
