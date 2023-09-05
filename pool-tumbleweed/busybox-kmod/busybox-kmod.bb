SUMMARY = "Busybox applets replacing kmod"
DESCRIPTION = "This package contains the symlinks to replace kmod with busybox."
LICENSE = "GPL-2.0-or-later"

PV = "1.36.1"

RPM_NAME = "busybox-kmod-1.36.1-29.1.noarch.rpm"
RPM_HASH = "559bfc17280cf42a51f2ac9b9ae8c8531e819434f6877dfb60932ef9fecc81e9befc332b3d0961c3800b789e06c67d49d2a0f75807c2ec1a5b292f36b3a47ae0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "/sbin/modprobe \
busybox-kmod"

RDEPENDS:${PN} += "busybox"

inherit rpm
