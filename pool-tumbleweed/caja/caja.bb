SUMMARY = "File manager for the MATE desktop"
DESCRIPTION = "Caja is the official file manager for the MATE desktop. It allows to \
browse directories, preview files and launch applications associated \
with them. It is also responsible for handling the icons on the MATE \
desktop. It works on local and remote filesystems."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "caja-1.26.1-1.4.aarch64.rpm"
RPM_HASH = "31ef805cc21f41fce3a9cf9f925cb738972ebce56e63421c387713d7b8af2b4d92267f3c63dde8829ebe6f4d96ef6409ff203c7b6a8b2f8f549d8c31e5cf420e"

RPROVIDES:${PN} += "caja \
mate-file-manager"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libICE.so.6 \
libSM.so.6 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo-gobject.so.2 \
libcairo.so.2 \
libcaja-extension.so.1 \
libexempi.so.8 \
libexif.so.12 \
libgailutil-3.so.0 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmate-desktop-2.so.17 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libselinux.so.1 \
libxml2.so.2"

inherit rpm
