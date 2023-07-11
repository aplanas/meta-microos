SUMMARY = "GNOME Keyring"
DESCRIPTION = "The GNOME Keyring is a daemon in the session, similar to ssh-agent, \
and other applications can use it to store passwords and other \
sensitive information. \
 \
The program can manage several keyrings, each with its own master \
password, and there is also a session keyring which is never stored to \
disk, but forgotten when the session ends."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "42.1"

RPM_NAME = "gnome-keyring-42.1-2.4.aarch64.rpm"
RPM_HASH = "168daa0c68c45c3160c4e2d579e19139db86e3b5097b1f0673404fb523fb6e2d120998b94bb784b331ca0df7c30eaf29cc9b34456e6c2cc34d32bd3307643416"

RPROVIDES:${PN} += "dbus-org.freedesktop.secrets \
dbus-org.gnome.keyring \
gnome-keyring"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgck-1.so.0 \
libgck-modules-gnome-keyring \
libgcr-base-3.so.1 \
libgcrypt.so.20 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libsystemd.so.0"

inherit rpm
