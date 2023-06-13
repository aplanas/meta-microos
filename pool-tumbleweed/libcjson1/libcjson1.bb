SUMMARY = "JSON parser library written in ANSI C"
DESCRIPTION = "A simple JSON parser library written in ANSI C."
LICENSE = "MIT"

PV = "1.7.15"

RPM_NAME = "libcjson1-1.7.15-1.8.aarch64.rpm"
RPM_HASH = "e6390fb15298e2e8c25ae09879663f2d70c9ff001ba313b61d25f2fd1ab5120bb9db1b26f449bc9e0d6647458e1217184892ec958053756b979a56cdd8ff2a21"

RPROVIDES:${PN} += "libcjson.so.1()(64bit) \
libcjson1 \
libcjson1(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
