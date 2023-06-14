SUMMARY = "Thunar Plugin for Sharing Files Using Samba"
DESCRIPTION = "The Thunar Shares Plugin allows for quickly sharing a directory using Samba \
from within Thunar without requiring root access."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.2"

RPM_NAME = "thunar-plugin-shares-0.3.2-1.3.aarch64.rpm"
RPM_HASH = "6b5e51cf29633f1306407f1a5355bce12048abded9629957610e9d00e2e8c66355b6dcf5af60b100876bbdcba4228cafbcc0e3c823a4bc03fbc198d95ad2ad9e"

RPROVIDES:${PN} += "thunar-plugin-shares \
thunar-shares-plugin"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libthunarx-3.so.0 \
samba \
thunar"

inherit rpm
