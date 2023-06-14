SUMMARY = "Creates a OBS cpio from a remote SCM resource"
DESCRIPTION = "Creates a OBS cpio from a remote SCM resource. \
 \
This can be used to work directly in local git checkout and can be packaged \
into a tar ball during build time."
LICENSE = "GPL-2.0-or-later"

PV = "0.10.36"

RPM_NAME = "obs-service-obs_scm-0.10.36-1.1.noarch.rpm"
RPM_HASH = "a8a9492c9316c8ab7785e4d973084845ec8836c6bac98ca4e70453c298b369b940d42a0ed314e5013928632166d1ed53627acf05483942fdbf48109a6c6b2135"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "obs-service-obs-scm \
obs-service-tar-scm-/usr/lib/obs/service/obs-scm.service"

RDEPENDS:${PN} += "git-core \
obs-service-obs-scm-common"

inherit rpm
