SUMMARY = "Utilities from libuna for Unicode/ASCII Byte Stream conversions"
DESCRIPTION = "Several tools for converting Unicode and ASCII (byte stream) based text."
LICENSE = "LGPL-3.0-or-later"

PV = "20230702"

RPM_NAME = "libuna-tools-20230702-1.1.aarch64.rpm"
RPM_HASH = "4a66bcd5682bfd1bcebca66f26fb022e9aaa71879dc7d9bd3dfc215aa73399cdb7f02196174936b3b54527e3ed5e04dd90bdbb43d269fa7607a868ea0cd8e79b"

RPROVIDES:${PN} += "libuna-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdatetime.so.1 \
libcerror.so.1 \
libcfile.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libuna.so.1"

inherit rpm
