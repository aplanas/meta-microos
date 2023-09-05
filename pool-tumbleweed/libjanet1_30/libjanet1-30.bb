SUMMARY = "Lisp-like functional and imperative programming language"
DESCRIPTION = "Janet is a functional and imperative programming language."
LICENSE = "MIT"

PV = "1.30.0"

RPM_NAME = "libjanet1_30-1.30.0-1.1.aarch64.rpm"
RPM_HASH = "39e494e3b73f5ff26802550dd189b920934a70389912a440ebd28ab39295e1bfede5ab61a9af0d0a6c61d43d13a43f766dcd60931ba81c9837b75a3b03f80174"

RPROVIDES:${PN} += "libjanet.so.1.30 \
libjanet1-30"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
