SUMMARY = "The X11 Protocol: X Protocol C Bindings"
DESCRIPTION = "The XCB protocol headers for X11 development. xcb-proto provides the \
XML-XCB protocol descriptions that libxcb uses to generate the majority of \
its code and API."
LICENSE = "X11"

PV = "7.6_1.15.2"

RPM_NAME = "xcb-proto-devel-7.6_1.15.2-2.2.aarch64.rpm"
RPM_HASH = "8c8b0df7f39d8c7d90513d3b9e42371ee018c67be0f6b314c5b8d516c68328037756b9c96da80357bbad96d1cf5b86d4ebb72aacbff518a237d701a42c8b37d8"

RPROVIDES:${PN} += "pkgconfig-xcb-proto \
xcb-proto-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
python3-xcb-proto-devel"

inherit rpm
