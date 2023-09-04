SUMMARY = "The GCC Preprocessor"
DESCRIPTION = "This Package contains just the preprocessor that is used by the X11 \
packages."
LICENSE = "GPL-3.0-or-later"

PV = "13.2.1+git7683"

RPM_NAME = "cpp13-13.2.1+git7683-1.1.aarch64.rpm"
RPM_HASH = "32aada9b2e66fc74e83761bfe3d8d04b511eae187427685fe9b9008d09a426d9b3c15e20db53b15ee1b4b4f43b3b1d2b827d6f47d30b8a2e2207da05436a350b"

RPROVIDES:${PN} += "cpp13"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libisl.so.23 \
libmpc.so.3 \
libmpfr.so.6 \
libz.so.1 \
libzstd.so.1"

inherit rpm
