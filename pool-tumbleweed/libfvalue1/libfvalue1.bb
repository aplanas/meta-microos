SUMMARY = "Library to provide generic file value functions"
DESCRIPTION = "Library to provide generic file value functions for the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20220120"

RPM_NAME = "libfvalue1-20220120-3.6.aarch64.rpm"
RPM_HASH = "42d34d117c718117aa9f38bfbc3b5d5761d307ce2bff087ee646cee54fb727cb974ddc4d370610d0371084796e76c936e4581e40f6ee3a59ac005d55bcfb9249"

RPROVIDES:${PN} += "libfvalue.so.1 \
libfvalue1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfwnt.so.1 \
libuna.so.1"

inherit rpm
