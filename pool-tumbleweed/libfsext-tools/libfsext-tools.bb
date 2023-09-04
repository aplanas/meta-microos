SUMMARY = "Tools to access the Extended File System (ext)"
DESCRIPTION = "Tools to access the Extended File System.  See libfsext for additional details."
LICENSE = "LGPL-3.0-or-later"

PV = "20230603"

RPM_NAME = "libfsext-tools-20230603-2.1.aarch64.rpm"
RPM_HASH = "40eb53d63ad6622e5407bd50b3c4a0d92a4e63d2785c494fd1124f6b2d0bf9b0ae74e031ab9eda2d3f4109e03db9e01e9f2b48f33b5ccb559c82720b76d405cb"

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
