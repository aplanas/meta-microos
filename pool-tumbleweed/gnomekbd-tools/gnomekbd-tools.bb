SUMMARY = "GNOME Keyboard tools"
DESCRIPTION = "GNOME keyboard library and utility. \
 \
This package provides various binaries and conversion tools for \
libgnomekbd."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28.1"

RPM_NAME = "gnomekbd-tools-3.28.1-1.4.aarch64.rpm"
RPM_HASH = "f6dce1548c1924e8dae702b4c91b8afeaa45027532e9472b6639bdc4b8a69dcaea0e09899dede703968d54426841db9063b6252650d4145435ccc03ca0fa64a2"

RPROVIDES:${PN} += "gnomekbd-tools"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libglib-2.0.so.0 \
libgnomekbdui.so.8 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxklavier.so.16"

inherit rpm
