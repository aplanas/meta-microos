SUMMARY = "Thunar Plugin Providing Integration with Archive Managers"
DESCRIPTION = "The Thunar Archive Plugin allows for creating and extracting archive files \
through the file context menus in the Thunar file manager using an archive \
manager. It provides scripting interface that can be used to adapt it to \
different archive managers."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.1"

RPM_NAME = "thunar-plugin-archive-0.5.1-1.2.aarch64.rpm"
RPM_HASH = "9bf54a6b99a4fdfcb2cfd5a43399422154c6562a15f730ed23d65b672d78ca7cc2af5fa9c3f271aa295a330c8f2fb3b607193aeddf4cca16e2c7558deb8faa36"

RPROVIDES:${PN} += "thunar-archive-plugin \
thunar-plugin-archive"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libthunarx-3.so.0 \
thunar"

inherit rpm
