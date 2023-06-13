SUMMARY = "Internal support library for GNOME games"
DESCRIPTION = "libgnome-games-support is a small library intended for internal use by \
GNOME Games, but it may be used by others. The API will only break \
with the major version number. The ABI is unstable."
LICENSE = "LGPL-3.0-or-later"

PV = "2.0.0"

RPM_NAME = "libgnome-games-support-2-4-2.0.0-1.7.aarch64.rpm"
RPM_HASH = "85a152588f9d921530e97c443a473dd06a3a87076763ba08f07df9296d1b49a981519e18d0faa686c6126728f7f9490633052156f374402521587f91d3def63b"

RPROVIDES:${PN} += "libgnome-games-support \
libgnome-games-support-2-4 \
libgnome-games-support-2-4(aarch-64) \
libgnome-games-support-2.so.4()(64bit)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgee-0.8.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-4.so.1()(64bit)"

inherit rpm
