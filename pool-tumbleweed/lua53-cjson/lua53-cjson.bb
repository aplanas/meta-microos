SUMMARY = "Lua JSON Encoding/Decoding"
DESCRIPTION = "This is the Lua extension package for JSON encoding/decoding."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "lua53-cjson-2.1.0-2.2.aarch64.rpm"
RPM_HASH = "8350ea86adb52a247db22fefbc5f1840e112cecbc9597cfbdfd576d759a468a86f34f975d7a8d0ad6fee021373f9834ef8c91ac68558450fc88680a6645fa5c5"

RPROVIDES:${PN} += "lua53-cjson \
lua53-cjson(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
lua53"

inherit rpm
