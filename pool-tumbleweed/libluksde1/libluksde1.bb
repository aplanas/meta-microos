SUMMARY = "Library to access the New Technology File System (NTFS)"
DESCRIPTION = "libluksde is a library to access LUKS Disk Encrypted volumes."
LICENSE = "LGPL-3.0-or-later"

PV = "20221103"

RPM_NAME = "libluksde1-20221103-3.9.aarch64.rpm"
RPM_HASH = "77d221ebf84a9de9b0e8e27aa7e984db49c00584e3137618e4a7dc9d45c489b7bc6ab991f7c4ccb0422deffbb26b641f09dbaebb70e4488b848e0190736665e3"

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
