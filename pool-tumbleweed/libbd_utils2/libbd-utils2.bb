SUMMARY = "Utility functions library for the LibBlockDev library"
DESCRIPTION = "libbd_utils is a library providing utility functions used by the \
LibBlockDev library and its plugins."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_utils2-2.28-1.4.aarch64.rpm"
RPM_HASH = "d262f2a8361ec9bc62db4efd5b9705b159ed388d0ad86a98e18c374089aa72421854bbce9ce7c4fbcf73cece9d7d2eb196f850278de6a3994bc2d21c9cf02bc9"

RPROVIDES:${PN} += "libbd-part-err.so.2 \
libbd-utils.so.2 \
libbd-utils2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libkmod.so.2 \
libudev.so.1"

inherit rpm
