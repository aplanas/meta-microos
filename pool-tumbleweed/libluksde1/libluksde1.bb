SUMMARY = "Library to access the New Technology File System (NTFS)"
DESCRIPTION = "libluksde is a library to access LUKS Disk Encrypted volumes."
LICENSE = "LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "libluksde1-20221103-4.1.aarch64.rpm"
RPM_HASH = "c9245cfdcb7c6f35ced179f8ca3926f240a70c9dd5073caae0d001375d41476fbc767084497b30a308feec3ab745cbf6cc83ef81ad69bfe294e594600224fee1"

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
