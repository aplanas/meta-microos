SUMMARY = "Utility functions library for the LibBlockDev library"
DESCRIPTION = "libbd_utils is a library providing utility functions used by the \
LibBlockDev library and its plugins."
LICENSE = "LGPL-2.1-only"

PV = "2.28"

RPM_NAME = "libbd_utils2-2.28-1.6.aarch64.rpm"
RPM_HASH = "6bdc34bc566d1a540215516bc0ac09bac4d105846829938d2c376f33f3ab946df92b5b46fe43956db083aea517aacdd42eeb87c107e3ee45ded7b85d2cb91ee6"

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
