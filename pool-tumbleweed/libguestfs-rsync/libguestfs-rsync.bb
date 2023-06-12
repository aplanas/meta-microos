SUMMARY = "Rsync support for libguestfs"
DESCRIPTION = "This adds rsync support to libguestfs.  Install it if you want to use \
rsync to upload or download files into disk images."
LICENSE = "GPL-2.0-or-later"

PV = "1.50.1"

RPM_NAME = "libguestfs-rsync-1.50.1-3.1.aarch64.rpm"
RPM_HASH = "0e169911320051cbdc05dacbbd3d52cfed5997301d4ae139e80f4c76b1cb4dd2fd91a8157c7813c4ff657446c108e4b6ada95f1a395e171fae32f85f04adb255"

RPROVIDES:${PN} += "libguestfs-rsync \
libguestfs-rsync(aarch-64)"
RDEPENDS:${PN} += "libguestfs"

inherit rpm
