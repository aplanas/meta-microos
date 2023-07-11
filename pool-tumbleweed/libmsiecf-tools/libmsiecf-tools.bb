SUMMARY = "Utilities to inspect MS Internet Explorer Cache Files"
DESCRIPTION = "Several tools for reading MS Internet Explorer Cache files."
LICENSE = "LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "libmsiecf-tools-20221024-3.7.aarch64.rpm"
RPM_HASH = "5e17a85f6b66365dfa4ef92491f3e94e4fdb3810a978dd3eb54f8c1f10585c79b788bb28cfe72028ade4ad78b5f77b2624e81cd39a84fcf233d5a181137cb823"

RPROVIDES:${PN} += "libmsiecf-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libmsiecf.so.1"

inherit rpm
