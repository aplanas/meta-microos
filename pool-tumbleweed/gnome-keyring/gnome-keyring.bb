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

RPM_NAME = "gnome-keyring-42.1-2.3.aarch64.rpm"
RPM_HASH = "d0ed5744af09383f63604d337c4fe7d9f5ab88d4338caff53ddcc0b66a49bed94321333bd9c6fac78dd2599315c452caf5a7d18b57bac5ce2f590c7fc0b8fc10"

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
