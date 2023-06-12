SUMMARY = "Example applications for OpenAMP"
DESCRIPTION = "This package contains example binaries for OpenAMP."
LICENSE = "BSD-3-Clause"

PV = "2020.01"

RPM_NAME = "openamp-examples-2020.01-1.12.aarch64.rpm"
RPM_HASH = "da4c80dd135ddd398f2546f847dfb1571e2962890de9460a8fc25066189046ef1b3fe498ca9e3d3acef1a15218d7381df46c5f9f5f3625db1aea225d9dee7205"

RPROVIDES:${PN} += "openamp-examples \
openamp-examples(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libmetal.so.0()(64bit) \
libopen_amp.so.0()(64bit) \
libopen_amp0"

inherit rpm
