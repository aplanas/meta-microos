SUMMARY = "Development files for the Input Device Library"
DESCRIPTION = "libinput is a library that handles input devices for display servers and \
other applications that need to directly deal with input devices. \
 \
This package contains all necessary include files and libraries needed \
to develop applications that require libinput."
LICENSE = "MIT"

PV = "1.24.0"

RPM_NAME = "libinput-devel-1.24.0-1.1.aarch64.rpm"
RPM_HASH = "4ab086aceef2dc12be9393f6ebffaca753434f470a2166eb8024c6ef3d7ce58d08611511f7f1738ece30b04637657eda67b0f6c1563ddd5925b7380e29ec9d28"

RPROVIDES:${PN} += "libinput-devel \
pkgconfig-libinput"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libinput10"

inherit rpm
