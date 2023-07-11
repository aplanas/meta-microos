SUMMARY = "Development files for the XCB image utility module"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
This package contains the development headers for the library found \
in libxcb-image0."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "xcb-util-image-devel-0.4.1-1.3.aarch64.rpm"
RPM_HASH = "92e522b1de7c87d72fe7ef6f35e789db9d7530fccf084d711c0a2d21f30a098041ed74781460d1d4330134954fb30dc6c1325bbe8a5ccb84bdc01e00cedf2897"

RPROVIDES:${PN} += "pkgconfig-xcb-image \
xcb-util-image-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcb-image0 \
pkgconfig-xcb \
pkgconfig-xcb-shm"

inherit rpm
