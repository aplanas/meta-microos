SUMMARY = "The X11 Protocol: X Protocol C Bindings"
DESCRIPTION = "The XCB protocol headers for X11 development. xcb-proto provides the \
XML-XCB protocol descriptions that libxcb uses to generate the majority of \
its code and API."
LICENSE = "X11"

PV = "7.6_1.15.2"

RPM_NAME = "xcb-proto-devel-7.6_1.15.2-2.1.aarch64.rpm"
RPM_HASH = "f7e38c330f6208d1d1ccc8530d08a0bc6dc0875c94e6f7b4c9b3b8ab83a6e41072f8ffac39753c5ba16a2872f03652647f3523c37673b5d1846ddaf9bbc64d34"

RPROVIDES:${PN} += "pkgconfig(xcb-proto) \
xcb-proto-devel \
xcb-proto-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
python3-xcb-proto-devel"

inherit rpm
