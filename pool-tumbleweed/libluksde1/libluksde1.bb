SUMMARY = "Library to access the New Technology File System (NTFS)"
DESCRIPTION = "libluksde is a library to access LUKS Disk Encrypted volumes."
LICENSE = "LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "libluksde1-20221103-3.12.aarch64.rpm"
RPM_HASH = "68db832e8e2802baa4ed3ea045fc3be027c829ba8ea392c85dc6dacd33fddf19a0eb482a44ecf71cb8cb42d63e98f930d23a0639d21eb49c92810e1c804d24be"

RPROVIDES:${PN} += "libluksde.so.1 \
libluksde1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcaes.so.1 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfcrypto.so.1 \
libfguid.so.1 \
libhmac.so.1 \
libuna.so.1"

inherit rpm
