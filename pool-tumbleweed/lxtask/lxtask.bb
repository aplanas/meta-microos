SUMMARY = "Lightweight Task Manager"
DESCRIPTION = "LXTask is a lightweight Task Manager. \
This is the default LXDE task manager."
LICENSE = "GPL-2.0-only"

PV = "0.1.10"

RPM_NAME = "lxtask-0.1.10-1.11.aarch64.rpm"
RPM_HASH = "3786ae5cf0686d2070d50d7515b8a4d0f9e8715a337202e9af3763f89e489c84017a274e6ed4b9240de70693d83b704277383ed4675c1199b8be8623a3aaffef"

RPROVIDES:${PN} += "lxtask"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
