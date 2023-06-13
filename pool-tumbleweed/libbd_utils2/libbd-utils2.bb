SUMMARY = "Utility functions library for the LibBlockDev library"
DESCRIPTION = "libbd_utils is a library providing utility functions used by the \
LibBlockDev library and its plugins."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_utils2-2.28-1.4.aarch64.rpm"
RPM_HASH = "d262f2a8361ec9bc62db4efd5b9705b159ed388d0ad86a98e18c374089aa72421854bbce9ce7c4fbcf73cece9d7d2eb196f850278de6a3994bc2d21c9cf02bc9"

RPROVIDES:${PN} += "libbd_part_err.so.2()(64bit) \
libbd_utils.so.2()(64bit) \
libbd_utils2 \
libbd_utils2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libkmod.so.2()(64bit) \
libkmod.so.2(LIBKMOD_5)(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
