SUMMARY = "Utilities from libuna for Unicode/ASCII Byte Stream conversions"
DESCRIPTION = "Several tools for converting Unicode and ASCII (byte stream) based text."
LICENSE = "LGPL-3.0-or-later"

PV = "20230710"

RPM_NAME = "libuna-tools-20230710-1.1.aarch64.rpm"
RPM_HASH = "5fde6628e8872e046bfd5e8b81d916d290039b2212b3a689abe453451032fbb1d83fc110e326c9ee574b0f26888ecd52104616185187b3dcfc84851d078fdb59"

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
