SUMMARY = "Caja development files"
DESCRIPTION = "Caja is the official file manager for the MATE desktop. It allows to \
browse directories, preview files and launch applications associated \
with them. It is also responsible for handling the icons on the MATE \
desktop. It works on local and remote filesystems."
LICENSE = "GPL-2.0-only & LGPL-2.0-only"

PV = "1.26.1"

RPM_NAME = "caja-devel-1.26.1-1.5.aarch64.rpm"
RPM_HASH = "d4229b56653945854cc481a018a45e877de3a4cf01dcdbfc444faddfd6442f5df820d636cc9a29240c9ab6117216998c959eb3d90bf36f40d9972ae8ee2e4bf6"

RPROVIDES:${PN} += "caja-devel \
mate-file-manager-devel \
pkgconfig-libcaja-extension"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
caja \
libcaja-extension1 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0"

inherit rpm
