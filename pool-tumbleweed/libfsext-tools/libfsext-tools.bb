SUMMARY = "Tools to access the Extended File System (ext)"
DESCRIPTION = "Tools to access the Extended File System.  See libfsext for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20230603"

RPM_NAME = "libfsext-tools-20230603-1.1.aarch64.rpm"
RPM_HASH = "80b0b9db38d886074b1f1a9f03a613afade22d9524fc4686e2919358fb883e5007f73cdfb6a03fa5ba0d20284431ba6492b2387c873ac1a47effc6905128f881"

RPROVIDES:${PN} += "libfsext-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfsext.so.1 \
libfsext1 \
libhmac.so.1 \
libuna.so.1"

inherit rpm
