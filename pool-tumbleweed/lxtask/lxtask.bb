SUMMARY = "Lightweight Task Manager"
DESCRIPTION = "LXTask is a lightweight Task Manager. \
This is the default LXDE task manager."
LICENSE = "GPL-2.0-only"

PV = "0.1.10"

RPM_NAME = "lxtask-0.1.10-1.11.aarch64.rpm"
RPM_HASH = "3786ae5cf0686d2070d50d7515b8a4d0f9e8715a337202e9af3763f89e489c84017a274e6ed4b9240de70693d83b704277383ed4675c1199b8be8623a3aaffef"

RPROVIDES:${PN} += "application() \
application(lxtask.desktop) \
lxtask \
lxtask(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit)"

inherit rpm
