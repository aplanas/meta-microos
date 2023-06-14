SUMMARY = "MATE Desktop calculator application"
DESCRIPTION = "mate-calc is a calculator application that was part of the \
OpenWindows Deskset of the Solaris 8 operating system. \
It incorporates multiple precision arithmetic packages based on the \
work of Professor Richard Brent."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.0"

RPM_NAME = "mate-calc-1.26.0-1.9.aarch64.rpm"
RPM_HASH = "64350f7a0e8ac979323dea79003958fbbd7a0cd406aa66e31d1dbfd65240b2ae76aeece2af9c16c512cdaaf0eb67370cbab9020900d5bb88c70746e7805456ad"

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
