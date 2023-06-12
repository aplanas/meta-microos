SUMMARY = "An easy to use virtual keyboard toolkit"
DESCRIPTION = "eekboard is a virtual keyboard software package, including a set of \
tools to implement desktop virtual keyboards."
LICENSE = "GPL-3.0-or-later"

PV = "1.0.8"

RPM_NAME = "eekboard-1.0.8-10.9.aarch64.rpm"
RPM_HASH = "a52d9d443d2666d153a5e307dbdfb9f593dc6cf508b55a427a2ce3293c312defb81574a84612a8a7b21fe30297b7255654a8eefcd071031ebd5f629106b115ab"

RPROVIDES:${PN} += "application() \
application(eekboard.desktop) \
config(eekboard) \
eekboard \
eekboard(aarch-64) \
libeek-gtk.so.0()(64bit) \
libeek-xkl.so.0()(64bit) \
libeek.so.0()(64bit) \
libeekboard.so.0()(64bit)"
RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXtst.so.6()(64bit) \
libatspi.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libcroco-0.6.so.3()(64bit) \
libgdk-3.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libxklavier.so.16()(64bit)"

inherit rpm
