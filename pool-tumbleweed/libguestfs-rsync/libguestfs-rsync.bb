SUMMARY = "Rsync support for libguestfs"
DESCRIPTION = "This adds rsync support to libguestfs.  Install it if you want to use \
rsync to upload or download files into disk images."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-rsync-1.50.1-4.1.aarch64.rpm"
RPM_HASH = "ca61c93fe4ed3d5649a33459022ab7275c5e8663f352681338ab775546bfc7c22c5f48a7422011f8df68e4f08ae80939b322b9a8fd43c0ecab5099f62a920fb3"

RPROVIDES:${PN} += "libguestfs-rsync"

RDEPENDS:${PN} += "libguestfs"

inherit rpm
