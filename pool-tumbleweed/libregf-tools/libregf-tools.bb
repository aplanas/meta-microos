SUMMARY = "Utilities to inspect Windows REGF-type Registry files"
DESCRIPTION = "Several tools for inspecting Windows REGF-type Registry files. \
Typically used for computer forensics."
LICENSE = "LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "libregf-tools-20230319-2.1.aarch64.rpm"
RPM_HASH = "f56ffe4643dc7329a6bc8e5a9b10910708504e9c93dc4881a7c1a1ee552e5b6ce5ec4a966c4b64eb1f6d3f77ebd8669f6163572412c5b91574f7818aed9e8367"

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
