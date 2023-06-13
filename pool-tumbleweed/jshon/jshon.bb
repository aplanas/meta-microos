SUMMARY = "A JSON parser for the shell"
DESCRIPTION = "Jshon parses, reads and creates JSON. It is usable from within the \
shell and can replace adhoc parsers made from grep/sed/awk as well as \
one-line parsers made from perl/python."
LICENSE = "MIT"

PV = "20131105"

RPM_NAME = "jshon-20131105-2.15.aarch64.rpm"
RPM_HASH = "3ad155498b2cd91990eaae7bbecf63cf05f650fb5ecfd10828ea86cfc079e410e1f19ee1b7dbced051ab6476dfebf172690c27174b9991b48f311f9bb31c0648"

RPROVIDES:${PN} += "jshon \
jshon(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjansson.so.4()(64bit) \
libjansson.so.4(libjansson.so.4)(64bit)"

inherit rpm
