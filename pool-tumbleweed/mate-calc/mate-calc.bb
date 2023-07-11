SUMMARY = "MATE Desktop calculator application"
DESCRIPTION = "mate-calc is a calculator application that was part of the \
OpenWindows Deskset of the Solaris 8 operating system. \
It incorporates multiple precision arithmetic packages based on the \
work of Professor Richard Brent."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-calc-1.26.0-1.10.aarch64.rpm"
RPM_HASH = "1e428215c6700d9a6989bcb5db1106b72ad2e7e48046b60057cf2ab224a36ad232b86bc840bedc6dcc292b4e70d1e25ba8653f323e33babfc8de4119797ab600"

RPROVIDES:${PN} += "mate-calc"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libatk-1.0.so.0 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libmpc.so.3 \
libmpfr.so.6 \
libpango-1.0.so.0 \
libxml2.so.2"

inherit rpm
