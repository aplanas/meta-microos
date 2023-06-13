SUMMARY = "Development files for the XCB cursor library (libxcursor port)"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
This package contains the development headers for the library found \
in libxcb-cursor0."
LICENSE = "MIT"

PV = "0.1.4"

RPM_NAME = "xcb-util-cursor-devel-0.1.4-1.3.aarch64.rpm"
RPM_HASH = "6ac5adc9fdf277c960029d0d9161cee7721dce2d6f4b2a3ab7bf6d0e2bce97149768f03966307f56a8af54a2eaff2e444f2f48202f45dd26d1c971e2cfa34b01"

RPROVIDES:${PN} += "pkgconfig(xcb-cursor) \
xcb-util-cursor-devel \
xcb-util-cursor-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcb-cursor0 \
pkgconfig(xcb) \
pkgconfig(xcb-image) \
pkgconfig(xcb-render) \
pkgconfig(xcb-renderutil)"

inherit rpm
