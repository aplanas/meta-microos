SUMMARY = "A window matching utility"
DESCRIPTION = "Devilspie 2 is based on the excellent program Devil's Pie by Ross Burton, and \
takes a folder as in-data, and checks that folder for LUA scripts. These \
scripts are run each time a window is opened, and the rules in them are applied \
on the window. \
 \
Unfortunately the rules of the original Devil's Pie are not supported."
LICENSE = "GPL-3.0-or-later"

PV = "0.44"

RPM_NAME = "devilspie2-0.44-1.1.aarch64.rpm"
RPM_HASH = "7f2ce791686bac9029544283bd1200e97763c7bd8c5ef26847ccb4a684f9e366c380758bc26ab003375f9410a017347c1682a3bb6a08db25c7cec96d781d90fd"

RPROVIDES:${PN} += "devilspie2"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXinerama.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
liblua5.3.so.5 \
libwnck-3.so.0"

inherit rpm
