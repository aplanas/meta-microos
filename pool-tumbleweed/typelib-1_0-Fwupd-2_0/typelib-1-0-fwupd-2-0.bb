SUMMARY = "GObject-introspection bindings for libfwupd"
DESCRIPTION = "fwupd is a daemon to allows session software to update device firmware on \
the local machine."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.8.16"

RPM_NAME = "typelib-1_0-Fwupd-2_0-1.8.16-2.1.aarch64.rpm"
RPM_HASH = "c892d0f930138e05e405993875e2a066471772d7048bd1359da5f208543350547d1dcfceebf83206f7b0ed95e6ea956cd893aacdc81d9d809ff88de333c0d50b"

RPROVIDES:${PN} += "typelib-1-0-Fwupd-2-0 \
typelib-Fwupd"

RDEPENDS:${PN} += "libfwupd.so.2 \
typelib-GLib \
typelib-GObject \
typelib-Gio \
typelib-Json"

inherit rpm
