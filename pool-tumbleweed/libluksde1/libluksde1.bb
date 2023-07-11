SUMMARY = "Library to access the New Technology File System (NTFS)"
DESCRIPTION = "libluksde is a library to access LUKS Disk Encrypted volumes."
LICENSE = "LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "libluksde1-20221103-3.11.aarch64.rpm"
RPM_HASH = "bc4b3abd042e8e7d6cb2791557f335a83ad94be00305adb6899c585136044a8749a751e41c2deb801e15ea54555fc3a261b98861da6e7c95d00b620ea6ea7236"

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
