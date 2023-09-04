SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39.1"

RPM_NAME = "libfdisk-devel-static-2.39.1-3.1.aarch64.rpm"
RPM_HASH = "2a06a93d61dcb64793a813b80ebdf588cd5f3d0b71446162bc5113860afce8cf4c2b32f144240f12018bb9efb89a72ab7077ea12f5b17ce41d2a955a8697d8dc"

RPROVIDES:${PN} += "libfdisk-devel-static"

RDEPENDS:${PN} += "libfdisk-devel"

inherit rpm
