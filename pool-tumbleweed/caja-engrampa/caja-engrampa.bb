SUMMARY = "MATE Desktop engrampa plugin for caja"
DESCRIPTION = "Engrampa is an archive manager for the MATE Desktop Environment. \
This means that you can create and modify archives; view the \
content of an archive; view and modify a file contained in the \
archive; extract files from the archive."
LICENSE = "GPL-2.0-or-later & LGPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "caja-engrampa-1.26.1-1.1.aarch64.rpm"
RPM_HASH = "2021f63f467d27f329f101d70740ff256331fbd9c6f71309ddd2b655b1342f977d3db9a16ff32eb07c2878bd7cd7a79b50462521d0c6fcab48586f31dc88b006"

RPROVIDES:${PN} += "caja-engrampa \
libcaja-engrampa.so \
mate-file-manager-engrampa"

RDEPENDS:${PN} += "engrampa \
libc.so.6 \
libcaja-extension.so.1 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0"

inherit rpm
