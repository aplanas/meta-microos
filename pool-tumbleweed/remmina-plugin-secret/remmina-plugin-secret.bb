SUMMARY = "Gnome Keyring Pasword Manager Plugin for Remmina"
DESCRIPTION = "This package provides a Remmina plugin for the GNOME keyring password manager."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.31"

RPM_NAME = "remmina-plugin-secret-1.4.31-1.1.aarch64.rpm"
RPM_HASH = "10343f442925a4ba1a49f6e3c8830cbfab74fee49a3f539fe84714edf5f4e30b47d163ac08515ab805f274972155e867e6ddfa5c36ebe13bf91081aea0e368a6"

RPROVIDES:${PN} += "remmina-plugin-secret \
remmina-plugins-gnome"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libsecret-1.so.0 \
remmina"

inherit rpm
