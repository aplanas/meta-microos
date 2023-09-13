SUMMARY = "Library for developing Anjuta plugins"
DESCRIPTION = "Anjuta is a versatile Integrated Development Environment (IDE) for the \
GNOME desktop."
LICENSE = "GPL-2.0-or-later"

PV = "3.34.0"

RPM_NAME = "libanjuta-3-0-3.34.0-5.8.aarch64.rpm"
RPM_HASH = "42df4eed5188a2a92bab3f842371689b83e8a92c3995d6cce1ce879bb9472a5ba797d49e03326e92c7964247146d155829930a5ec610f9e9d3edf82f906b694a"

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
