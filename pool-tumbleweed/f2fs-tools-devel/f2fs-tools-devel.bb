SUMMARY = "Development files for f2fs"
DESCRIPTION = "This package contains development files for f2fs-tools."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.15.0"

RPM_NAME = "f2fs-tools-devel-1.15.0-2.4.aarch64.rpm"
RPM_HASH = "e8d103b254c16e12a7d6ef44640f99c90a43e89a0958f9c422c44ad501c92e8494f634bde19b3549ce267191162a0e7fd7b29370f45d8fd1607e8fa3495e8f7b"

RPROVIDES:${PN} += "f2fs-tools-devel"

RDEPENDS:${PN} += "libf2fs-format8 \
libf2fs9"

inherit rpm
