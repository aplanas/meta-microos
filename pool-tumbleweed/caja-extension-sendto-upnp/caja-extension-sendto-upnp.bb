SUMMARY = "UPnP integration for the MATE Desktop file manager"
DESCRIPTION = "This package provides the functionality to the Caja file manager to \
send files over e-mail or instant messaging protocols via Evolution, \
Empathy and Pidgin."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.1"

RPM_NAME = "caja-extension-sendto-upnp-1.26.1-2.3.aarch64.rpm"
RPM_HASH = "a8ba899f103e7824d33d4956049e56191f4f307c88a3e5700fa091f9b9dfa4697ea2e71ee2fb90707ce7be8c4317fef9225e0253e4b41271f2f531ebcd41d327"

RPROVIDES:${PN} += "caja-extension-sendto-upnp \
caja-sendto-upnp \
libnstupnp.so \
mate-file-manager-sendto-upnp"

RDEPENDS:${PN} += "caja-extension-sendto \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgssdp-1.6.so.0 \
libgtk-3.so.0 \
libgupnp-1.6.so.0"

inherit rpm
