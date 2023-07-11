SUMMARY = "Shared library for gnome-calculator"
DESCRIPTION = "This package contains a shared library for gnome-calculator."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "libgcalc-2-1_0_1-44.0-1.2.aarch64.rpm"
RPM_HASH = "e5c6c27e8484cbed9ccaddd303b6f12a014dc5c2b30aab90b66d90b28a84e4d15711307dab2da3a01b4caf24de0f55c0830afaa66e248e8fee30129dfcf4882c"

RPROVIDES:${PN} += "libgcalc-2-1-0-1 \
libgcalc-2.so.1.0.1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgee-0.8.so.2 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libmpc.so.3 \
libmpfr.so.6"

inherit rpm
