SUMMARY = "Rsync for cloud storage"
DESCRIPTION = "rsync for cloud storage. rclone is a command line program to sync files and \
directories to and from a wide variety of cloud storage providers, providing \
various additional features."
LICENSE = "MIT"

PV = "1.63.0"

RPM_NAME = "rclone-1.63.0-1.1.aarch64.rpm"
RPM_HASH = "fbe0417775e89ce341a3d14749ee9294f234b80f8d3ec4aabf032616969451b9ca55916c36600a83c1f37797c800c154bd21313a27c07c2d0f41fdb93222c4d6"

RPROVIDES:${PN} += "rclone"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
