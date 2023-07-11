SUMMARY = "Download Manager with a GTK+ user interface"
DESCRIPTION = "Uget is a download manager written with GTK+. It supports \
pause and resume, and the ability to classify download, with every \
category having an independent configuration."
LICENSE = "LGPL-2.1-or-later"

PV = "2.2.3"

RPM_NAME = "uget-2.2.3-3.15.aarch64.rpm"
RPM_HASH = "3ea46f3273db113489af55582e8e7a1165a1c42c4474c33663cf9bf38ada832524b7ee8bfbcfcb1024b6bc0ae1166f855e523fea0d57444a6cd239486e018e51"

RPROVIDES:${PN} += "uget"

RDEPENDS:${PN} += "aria2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libcurl.so.4 \
libgcrypt.so.20 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgstreamer-1.0.so.0 \
libgtk-3.so.0 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0"

inherit rpm
