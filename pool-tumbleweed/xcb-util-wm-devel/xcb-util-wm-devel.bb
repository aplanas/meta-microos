SUMMARY = "Development files for the XCB EWMH/ICCCM utility modules"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
This package contains the development headers for the library found \
in libxcb-ewmh2, libxcb-icccm4."
LICENSE = "MIT"

PV = "0.4.2"

RPM_NAME = "xcb-util-wm-devel-0.4.2-1.2.aarch64.rpm"
RPM_HASH = "03c0312fa8ee7db4ee4dc59f88c4b59e175ed081eac7721656acc24931e4dd6d3ffa24671c95ecb1d5f9899e54125e47e3fb01342ce2c1151b8733da979d1aec"

RPROVIDES:${PN} += "pkgconfig-xcb-ewmh \
pkgconfig-xcb-icccm \
xcb-util-wm-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcb-ewmh2 \
libxcb-icccm4 \
pkgconfig-xcb"

inherit rpm
