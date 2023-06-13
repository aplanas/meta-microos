SUMMARY = "Yet Another JSON Library"
DESCRIPTION = "YAJL is a small event-driven (SAX-style) JSON parser written in ANSI C, and a \
small validating JSON generator."
LICENSE = "ISC"

PV = "2.1.0"

RPM_NAME = "libyajl2-2.1.0-7.1.aarch64.rpm"
RPM_HASH = "9a9df215bfc557b487d3b9f63f99bc137bbfa1ea88a2e181f5ea77b129878d59b2be51f2664fa7f7bbd9f82ee6d377e99a113404f854cbe5c839e0a7a5fd21b4"

RPROVIDES:${PN} += "libyajl.so.2()(64bit) \
libyajl2 \
libyajl2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
