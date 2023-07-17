SUMMARY = "The GNU Compiler Thread Sanitizer Runtime Library"
DESCRIPTION = "The runtime library needed to run programs compiled with the \
-fsanitize=thread option of the GNU Compiler Collection (GCC)."
LICENSE = "MIT"

PV = "13.1.1+git7552"

RPM_NAME = "libtsan2-13.1.1+git7552-1.1.aarch64.rpm"
RPM_HASH = "d63430701f52167f6b48972cf472cc2bd36c4cadbd491966a9cb6c48f86b9a846f9f28b3ffa23623b267c2945480e16460cd726acadb921dbe89eb0840e38b8f"

RPROVIDES:${PN} += "libtsan.so.2 \
libtsan2"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
