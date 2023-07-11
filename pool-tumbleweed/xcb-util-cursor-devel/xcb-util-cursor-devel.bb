SUMMARY = "Development files for the XCB cursor library (libxcursor port)"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
This package contains the development headers for the library found \
in libxcb-cursor0."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "xcb-util-cursor-devel-0.1.4-1.4.aarch64.rpm"
RPM_HASH = "596574bb57ec38f8c70c0635a314b6b1efb545161e8fd7e141672b66ff29e121f3d9502a2f8aa3e3aba7583247c4356a46cd388699bc09764fd2824b55ca94d2"

RPROVIDES:${PN} += "pkgconfig-xcb-cursor \
xcb-util-cursor-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcb-cursor0 \
pkgconfig-xcb \
pkgconfig-xcb-image \
pkgconfig-xcb-render \
pkgconfig-xcb-renderutil"

inherit rpm
