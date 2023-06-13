SUMMARY = "Development files for xcb-imdkit"
DESCRIPTION = "This package provides development files for xcb-imdkit."
LICENSE = "LGPL-2.1-only"

PV = "1.0.5"

RPM_NAME = "xcb-imdkit-devel-1.0.5-1.1.aarch64.rpm"
RPM_HASH = "9803e4838b1edd5a1d7cc1684060ceff20743de75dfbeff1693fda8ca39448ea8d39612411c9ad7460a98cb32ce741ef706596c6233e4af06d88556f0cc246e2"

RPROVIDES:${PN} += "cmake(XCBImdkit) \
pkgconfig(xcb-imdkit) \
xcb-imdkit-devel \
xcb-imdkit-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcb-imdkit1 \
pkgconfig(xcb) \
pkgconfig(xcb-util)"

inherit rpm
