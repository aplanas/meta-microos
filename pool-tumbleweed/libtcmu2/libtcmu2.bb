SUMMARY = "Runtime libraries for tcmu-runner"
DESCRIPTION = "This package contains the runtime libraries for tcmu-runner."
LICENSE = "Apache-2.0"

PV = "1.6.2"

RPM_NAME = "libtcmu2-1.6.2-1.1.aarch64.rpm"
RPM_HASH = "c254ba46aab860a60b323362087c7ceb88fb9360cb82c3540699a68a68bfc98f133e8b6e9ac6daf5dca83a32cb7bc1df28b02eb5010cd437b91c47e31faef748"

RPROVIDES:${PN} += "libtcmu.so.2 \
libtcmu2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnl-3.so.200 \
libnl-genl-3.so.200 \
libtcmalloc.so.4"

inherit rpm
