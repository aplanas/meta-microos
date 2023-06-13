SUMMARY = "Busybox applets replacing psmisc"
DESCRIPTION = "This package contains the symlinks to replace psmisc with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-psmisc-1.36.0-26.3.noarch.rpm"
RPM_HASH = "18c22aa9844d7edd93c8eafc0eabf26a19292078db72ba89f66696f45f773ca337a5b067821f959800438a77f5ee1fbcd1742f104b86a8511e2829b8c40490f2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/bin/fuser \
busybox-psmisc"

RDEPENDS:${PN} += "busybox"

inherit rpm
