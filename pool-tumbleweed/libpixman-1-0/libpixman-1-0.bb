SUMMARY = "Pixel manipulation library"
DESCRIPTION = "Pixman is a pixel manipulation library for X and cairo."
LICENSE = "MIT"

PV = "0.42.2"

RPM_NAME = "libpixman-1-0-0.42.2-1.3.aarch64.rpm"
RPM_HASH = "87210d529915be20a279bbc0a09fb6b84e9e8375ef125a9672682c2eb0fe0b4637f1f791e603f12dd9c93329aacaf133f1129d05e219cc7f5f096aa2ba2f588f"

RPROVIDES:${PN} += "libpixman-1-0 \
libpixman-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
