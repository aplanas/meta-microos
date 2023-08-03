SUMMARY = "Rsync for cloud storage"
DESCRIPTION = "rsync for cloud storage. rclone is a command line program to sync files and \
directories to and from a wide variety of cloud storage providers, providing \
various additional features."
LICENSE = "MIT"

PV = "1.63.1"

RPM_NAME = "rclone-1.63.1-1.1.aarch64.rpm"
RPM_HASH = "d95cce0de147bcde178d3a2b6cb353916e971214a88388d91886a7f6993e31309eda9fa48d8474781f2f96c2dd8e2c9fca64d664698dcbfd4484ea8458c6aa6c"

RPROVIDES:${PN} += "rclone"

RDEPENDS:${PN} += "libc.so.6"

inherit rpm
