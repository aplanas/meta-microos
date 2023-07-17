SUMMARY = "Rsync for cloud storage"
DESCRIPTION = "rsync for cloud storage. rclone is a command line program to sync files and \
directories to and from a wide variety of cloud storage providers, providing \
various additional features."
LICENSE = "MIT"

PV = "1.63.0"

RPM_NAME = "rclone-1.63.0-2.1.aarch64.rpm"
RPM_HASH = "0b9967480eb857147a0202166ac873f26d0f813dad694eaccce24502f532db71479ceb918e84090c5e02f514ac066b8372ac3c9914e4007b3e717aa46fd22a7b"

RPROVIDES:${PN} += "rclone"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
