SUMMARY = "GNU Go compiler runtime library"
DESCRIPTION = "Runtime library for the GNU Go language."
LICENSE = "BSD-3-Clause"

PV = "13.1.1+git7597"

RPM_NAME = "libgo22-13.1.1+git7597-1.1.aarch64.rpm"
RPM_HASH = "4e88dbd758c9c24b9d91a99cbe1acfeb741dfa87548567e59e2bf9396d70540907ffa4a3b9afaf20d3dc799d1d69dd4e02c584a9f075c664274bea9bba434278"

RPROVIDES:${PN} += "libgo.so.22 \
libgo22"

RDEPENDS:${PN} += "/sbin/ldconfig \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6"

inherit rpm
