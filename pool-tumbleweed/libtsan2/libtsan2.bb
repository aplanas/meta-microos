SUMMARY = "The GNU Compiler Thread Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=thread option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7364"

RPM_NAME = "libtsan2-13.1.1+git7364-1.1.aarch64.rpm"
RPM_HASH = "733929df1cdefbdc2ff9deddc8c1849c101e37c27db7b1ad3f21e29f8c28033e220b36d98bbbc9f1bc0e10f252564fd75d9bc8048d364859ffb18e96fe0a86ac"

RPROVIDES:${PN} += "libtsan.so.2 \
libtsan2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
