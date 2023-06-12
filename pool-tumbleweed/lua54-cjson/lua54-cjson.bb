SUMMARY = "Lua JSON Encoding/Decoding"
DESCRIPTION = "This is the Lua extension package for JSON encoding/decoding."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "lua54-cjson-2.1.0-2.2.aarch64.rpm"
RPM_HASH = "e03be72bc8ee4078f8c04aa3f0cae72b6c574c1c4889e3cb1abfb30492a2fc0387b52cf0ec0df5693da9154c0c491a8e0db34c23df57eca2c6b3ff6a90186263"

RPROVIDES:${PN} += "lua-cjson \
lua54-cjson \
lua54-cjson(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
lua54"

inherit rpm
