SUMMARY = "Busybox applets replacing diffutils"
DESCRIPTION = "This package contains the symlinks to replace diffutils with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-diffutils-1.36.0-26.3.noarch.rpm"
RPM_HASH = "94ada605421974f0fd5375f8f6cf06a3c224f895458b90f3d919b45b7565cdd8d5b5c54a3ef691b3170a069e2e1c369a96b68e5e66abb14ec91e1de14d667859"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "busybox-diffutils"

RDEPENDS:${PN} += "busybox"

inherit rpm
