SUMMARY = "Creates a OBS cpio from a remote SCM resource"
DESCRIPTION = "Creates a OBS cpio from a remote SCM resource. \
 \
This can be used to work directly in local git checkout and can be packaged \
into a tar ball during build time."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.41"

RPM_NAME = "obs-service-obs_scm-0.10.41-1.1.noarch.rpm"
RPM_HASH = "8bb5688ffff28cce825804a612aac55299df9af1135d85bb6c0885ba12d7c47fa3ce7a8dc6d5f62a79d55ddbc91adb0ceaa52091eb478568cd3b82d0ec44887d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-obs-scm \
obs-service-tar-scm-/usr/lib/obs/service/obs-scm.service"

RDEPENDS:${PN} += "git-core \
obs-service-obs-scm-common"

inherit rpm
