SUMMARY = "Common files used by font-manager"
DESCRIPTION = "This package contains common files such as libraries. \
 These files are required by font-manager and font-viewer."
LICENSE = "GPL-3.0-or-later"

PV = "0.8.8"

RPM_NAME = "font-manager-common-0.8.8-2.4.aarch64.rpm"
RPM_HASH = "0d596037143e91a4c142db5b97462f2cd1d636fc1da7883d38ecdc74a84031e1104da3725776a85991dbe6cb859272431b990c2d7919f58e64fb8e793f8e078f"

RPROVIDES:${PN} += "font-manager-common \
libfontmanager.so.0"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libfreetype.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libharfbuzz.so.0 \
libjson-glib-1.0.so.0 \
libpango-1.0.so.0 \
libpangoft2-1.0.so.0 \
libsqlite3.so.0 \
libxml2.so.2"

inherit rpm
