SUMMARY = "Development files for the XCB errors library"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
This package contains the development headers for the library found \
in libxcb-errors0."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "xcb-util-errors-devel-1.0.1-1.2.aarch64.rpm"
RPM_HASH = "8acbfa3fbf71e7a449f8dc763ac563325af2c591d35cdf8f80f2ea6ce63649a53fba9fc353643a5e23593be7d0ae4d3e8d3a7fc1a12c3b68666729c90f3db455"

RPROVIDES:${PN} += "pkgconfig-xcb-errors \
xcb-util-errors-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcb-errors0 \
pkgconfig-xcb"

inherit rpm
