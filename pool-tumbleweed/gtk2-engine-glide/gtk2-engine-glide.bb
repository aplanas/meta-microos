SUMMARY = "Glide GTK+ 2 Theme Engine"
DESCRIPTION = "This packages provides the Glide engine for GTK+ 2, originally written \
for the Glider theme."
LICENSE = "LGPL-2.1+"

PV = "2.20.2"

RPM_NAME = "gtk2-engine-glide-2.20.2-19.43.aarch64.rpm"
RPM_HASH = "c25d4b2db2d06ed59dd72cc408e677f464cbf05ba664bd2d8a6a0d0809cf04fd16d6fef7f46a0a5b7fa065b0ea2f4332afce6e5ad936f33a92a182019b108bb3"

RPROVIDES:${PN} += "gtk2-engine-glide \
libglide.so"

RDEPENDS:${PN} += "gtk2 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0"

inherit rpm
