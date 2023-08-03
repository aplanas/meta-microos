SUMMARY = "GObject-introspection bindings for libfwupd"
DESCRIPTION = "fwupd is a daemon to allows session software to update device firmware on \
the local machine."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.17"

RPM_NAME = "typelib-1_0-Fwupd-2_0-1.8.17-1.1.aarch64.rpm"
RPM_HASH = "cb6e90626e24b1a6158768ff12d9454000be7e57bccede722e89e418f93cb327da096e7dd4411ad4298d6eab90964ad6bf2884c28dbf342f7760214d7df0088d"

RPROVIDES:${PN} += "typelib-1-0-Fwupd-2-0 \
typelib-Fwupd"

RDEPENDS:${PN} += "libfwupd.so.2 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Json"

inherit rpm
