SUMMARY = "The GNU Compiler Thread Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=thread option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "12.3.0+git1204"

RPM_NAME = "libtsan2-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "30cb872b0dd5b690cc72eb261c419c34222aaac8df77784bad261b33bd23ef90c60a577eb67cff701b06f304d3a9c2942a0d8e05af1730a1db67fa831dab5669"

RPROVIDES:${PN} += "libtsan.so.2()(64bit) \
libtsan2 \
libtsan2-gcc12 \
libtsan2-gcc12(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit)"

inherit rpm
