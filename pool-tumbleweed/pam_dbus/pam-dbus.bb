SUMMARY = "PAM module asking the logged in user for confirmation"
DESCRIPTION = "This PAM module will, when being used to authenticate a \
(typically remote) user, use D-Bus to ask any currently logged \
in (typically local) user to accept or deny the authentication request."
LICENSE = "GPL-2.0-or-later"

PV = "0.2.1.3"

RPM_NAME = "pam_dbus-0.2.1.3-6.7.aarch64.rpm"
RPM_HASH = "7e15e34c19cb8ce1df5bbe430d76a44dbbbb2573537b7becaa1b9f59d652600077eb38dbb26b9ade06ea4659d8b7d98f9caca68eabc43eca3bfe37b844b3d1aa"

RPROVIDES:${PN} += "config-pam-dbus \
pam-dbus"

RDEPENDS:${PN} += "/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-glib-1.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libpam.so.0 \
python3 \
python3-base \
python3-notify2"

inherit rpm
