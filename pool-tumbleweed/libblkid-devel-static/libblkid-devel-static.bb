SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39.1"

RPM_NAME = "libblkid-devel-static-2.39.1-1.1.aarch64.rpm"
RPM_HASH = "4e2383a49490506ab5dea1469aa19a042a38e8a43595a5411d50b6cdad9bbfac8f0e83253c886ab5010e75d5225552eecc0c440716c66833495f48501ebf8b4e"

RPROVIDES:${PN} += "libblkid-devel-static"

RDEPENDS:${PN} += "libblkid-devel"

inherit rpm
