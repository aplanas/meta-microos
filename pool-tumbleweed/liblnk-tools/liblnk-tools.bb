SUMMARY = "Tools to access the Windows Shortcut File (LNK) format"
DESCRIPTION = "liblnk is a library to access Windows Shortcut File (LNK) files."
LICENSE = "LGPL-3.0-or-later"

PV = "20230205"

RPM_NAME = "liblnk-tools-20230205-1.8.aarch64.rpm"
RPM_HASH = "6f23c19e0733a75869859d35b17f379b5a6bf2d99292b5879452e5c97d1a17c49fe9d58b008a07f59d40149f12b5026be7f9e63f244ea917bad2e2d188dda62c"

RPROVIDES:${PN} += "liblnk-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfdatetime.so.1 \
libfguid.so.1 \
libfwps.so.1 \
libfwsi.so.1 \
liblnk.so.1"

inherit rpm
