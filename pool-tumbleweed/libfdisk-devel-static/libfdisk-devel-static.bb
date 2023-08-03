SUMMARY = "Development files for the filesystem detection library"
DESCRIPTION = "Files needed to develop applications using the library for filesystem \
detection."
LICENSE = "LGPL-2.1-or-later"

PV = "2.39.1"

RPM_NAME = "libfdisk-devel-static-2.39.1-1.1.aarch64.rpm"
RPM_HASH = "a46b9ef98791b3d9277dc467e9b03aa9d5969b8b0322af9cab73030ea3fed94f757fdbd52dc68a5060f76551e3fcb6c383afee14d7bdd609b791cc6b55574b1a"

RPROVIDES:${PN} += "libfdisk-devel-static"

RDEPENDS:${PN} += "libfdisk-devel"

inherit rpm
