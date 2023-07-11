SUMMARY = "Thunar Plugin for Sharing Files Using Samba"
DESCRIPTION = "The Thunar Shares Plugin allows for quickly sharing a directory using Samba \
from within Thunar without requiring root access."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.2"

RPM_NAME = "thunar-plugin-shares-0.3.2-1.4.aarch64.rpm"
RPM_HASH = "ee923ef6861adcaf88df812950eb7b686d0957f46931d87b01d76214d8e7d227b6d65448442a4245d627e48ba8da5b8dee1a61d11a5bb6305244493c166be880"

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
