SUMMARY = "Tumbler Library"
DESCRIPTION = "This package provides the shared library component of tumbler."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "4.18.1"

RPM_NAME = "libtumbler-1-0-4.18.1-1.1.aarch64.rpm"
RPM_HASH = "b3e3078610468687dce4810fef7e7b1088d51175837a343d5ab43454a58f1cd9d938051320ad6f6b07bc63242018642724d927007d15e5aa28ef5841e7954c9c"

RPROVIDES:${PN} += "libtumbler-1-0 \
libtumbler-1.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libxfce4util.so.7"

inherit rpm
