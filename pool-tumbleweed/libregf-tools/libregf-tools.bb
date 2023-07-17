SUMMARY = "Utilities to inspect Windows REGF-type Registry files"
DESCRIPTION = "Several tools for inspecting Windows REGF-type Registry files. \
Typically used for computer forensics."
LICENSE = "LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "libregf-tools-20230319-1.6.aarch64.rpm"
RPM_HASH = "6050d932fbdb1e4335ff79be3b8e70b093bd746f763f923defc920c4a7928b6c19f86ee87287a0448d7552551108d8c92106aa74347052a68b72097e5078c830"

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
