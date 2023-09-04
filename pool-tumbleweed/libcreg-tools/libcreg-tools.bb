SUMMARY = "Utilities to inspect Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "Several tools for inspecting Windows 9x/Me REGF-type Registry files. \
Typically used for computer forensics."
LICENSE = "LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "libcreg-tools-20210625-6.1.aarch64.rpm"
RPM_HASH = "efdece8e50a775e6cf32b0195c96d1eed09d5e569404e3c28f69465449a2126501a07ea23e2fa3e7c5764538539d010acddaa5b868f06b85af4825dd22c1c7cc"

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
