SUMMARY = "Utilities to inspect Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "Several tools for inspecting Windows 9x/Me REGF-type Registry files. \
Typically used for computer forensics."
LICENSE = "LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "libcreg-tools-20210625-5.10.aarch64.rpm"
RPM_HASH = "e5616dbb420405893c1469d756bcd718af94b5f4a6bf03c103ecdd57cb0aafecd6336967d5f250c11327eac63c53bc472e5cec4b0d09a878bdef456100bd755d"

RPROVIDES:${PN} += "libcreg-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcreg.so.1 \
libfuse.so.2 \
libuna.so.1"

inherit rpm
