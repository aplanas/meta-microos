SUMMARY = "The X11 Protocol: X Protocol C Bindings"
DESCRIPTION = "The XCB protocol headers for X11 development. xcb-proto provides the \
XML-XCB protocol descriptions that libxcb uses to generate the majority of \
its code and API."
LICENSE = "X11"

PV = "7.6_1.16.0"

RPM_NAME = "xcb-proto-devel-7.6_1.16.0-1.1.aarch64.rpm"
RPM_HASH = "daab13cb16ae7d7b41b78741e939a7b7319b54ba518769fa481fcb48004f3d598fa6b7e8eb7ebbbe2031b5045ba3ee82daf8268bfe288c6388e2b819c89d8ef3"

RPROVIDES:${PN} += "pkgconfig-xcb-proto \
xcb-proto-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
python3-xcb-proto-devel"

inherit rpm
