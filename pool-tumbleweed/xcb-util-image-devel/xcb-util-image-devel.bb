SUMMARY = "Development files for the XCB image utility module"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
This package contains the development headers for the library found \
in libxcb-image0."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "xcb-util-image-devel-0.4.1-1.2.aarch64.rpm"
RPM_HASH = "5123bb23f2dd9bb958bd32ac64786ff0760959a0985a37183b0e48ed9ca5069c9606c91667767428b9580f51070f85025dc61571c785ebf84adea4d32e02d82a"

RPROVIDES:${PN} += "pkgconfig-xcb-image \
xcb-util-image-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcb-image0 \
pkgconfig-xcb \
pkgconfig-xcb-shm"

inherit rpm
