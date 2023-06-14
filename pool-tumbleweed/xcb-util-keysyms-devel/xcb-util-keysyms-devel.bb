SUMMARY = "Development files for the XCB keysyms utility module"
DESCRIPTION = "The XCB util modules provide a number of libraries which sit on top \
of libxcb, the core X protocol library, and some of the extension \
libraries. \
 \
This package contains the development headers for the library found \
in libxcb-keysyms1."
LICENSE = "MIT"

PV = "0.4.1"

RPM_NAME = "xcb-util-keysyms-devel-0.4.1-1.2.aarch64.rpm"
RPM_HASH = "c3868ff61fe336f0a01d0e36b0932c6ea15b4b892127deab1a8e5a927a6720a4819cfcabcd7616fb161b0f1993724ff49bc06be26b22e02a7a19745c8e6bf53d"

RPROVIDES:${PN} += "pkgconfig-xcb-keysyms \
xcb-util-keysyms-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libxcb-keysyms1 \
pkgconfig-xcb"

inherit rpm
