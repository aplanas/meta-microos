SUMMARY = "Utilities for reading and writing storage media (split) RAW files"
DESCRIPTION = "This subpackage contains the utility programs from libsmraw to \
acquire, export, query and verify storage media (split) RAW files."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "libsmraw-tools-20230320-1.7.aarch64.rpm"
RPM_HASH = "bbde2edfa0f620fac640771125123b788483c1bafd5d61c06c117f415f8b570d1b74b2f4af0c7a9361668534f224f83c738966e4491dbaa30bdec0697304c2bc"

RPROVIDES:${PN} += "libsmraw-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcsplit.so.1 \
libfuse.so.2 \
libhmac.so.1 \
libsmraw.so.1"

inherit rpm
