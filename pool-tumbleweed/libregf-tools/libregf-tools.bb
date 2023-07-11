SUMMARY = "Utilities to inspect Windows REGF-type Registry files"
DESCRIPTION = "Several tools for inspecting Windows REGF-type Registry files. \
Typically used for computer forensics."
LICENSE = "LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "libregf-tools-20230319-1.5.aarch64.rpm"
RPM_HASH = "6d30b84bb1db5daf5a7baec35a5d0c0d5b4c230b829aa3a8242ad6b6790514383cc39bfbfbbdc8fa34c47b2cf330e5d6acaa7e0cc4ec6ddf469093f280e16688"

RPROVIDES:${PN} += "libregf-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfuse.so.2 \
libregf.so.1 \
libuna.so.1"

inherit rpm
