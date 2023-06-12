SUMMARY = "Busybox applets replacing hostname"
DESCRIPTION = "This package contains the symlinks to replace hostname with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.0"

RPM_NAME = "busybox-hostname-1.36.0-26.3.noarch.rpm"
RPM_HASH = "450abe89c72d7fbfefa86777ee719f90353ac98b7f35637b8920ef3e1f7bf02386fd7844952b41deddcb650f7bacf7acbf005b9816e92827c9b45c1d42d55920"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/bin/hostname \
busybox-hostname"
RDEPENDS:${PN} += "busybox"

inherit rpm
