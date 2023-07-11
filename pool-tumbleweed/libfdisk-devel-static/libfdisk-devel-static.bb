SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39"

RPM_NAME = "libfdisk-devel-static-2.39-1.1.aarch64.rpm"
RPM_HASH = "e2dbae96bdf6ceaa244fb21db0c91483933178ab2eebea9183e7031e3d2ef048dab255bd8b4c0420cc9e1441b0ac9d8954c08991b822966ceaf963bde3c2aa6d"

RPROVIDES:${PN} += "libfdisk-devel-static"

RDEPENDS:${PN} += "libfdisk-devel"

inherit rpm
