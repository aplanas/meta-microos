SUMMARY = "Library for developing Anjuta plugins"
DESCRIPTION = "Anjuta is a versatile Integrated Development Environment (IDE) for the \
GNOME desktop."
LICENSE = "GPL-2.0-or-later"

PV = "3.34.0"

RPM_NAME = "libanjuta-3-0-3.34.0-5.7.aarch64.rpm"
RPM_HASH = "972ab7f0ba8895d91206e57c209165833752bae1a328a7f922de553fbb8f6e4edb99382133473b938ac93da450ab949460501cb12f2ec8c3886a6713285b153d"

RPROVIDES:${PN} += "libanjuta-3-0 \
libanjuta-3.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgdl-3.so.5 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libxml2.so.2"

inherit rpm
