SUMMARY = "X11 ICC Daemon"
DESCRIPTION = "xiccd is a bridge between colord and the X server. Its tasks are: \
 \
 * to enumerate displays and register them in colord, \
 * to create default ICC profiles based on EDID data, \
 * to apply ICC profiles provided by colord, \
 * and to maintain user's private ICC storage directory. \
 \
It does basically the same as the gnome-settings-daemon colour plugin \
or colord-kde without depending on any particular desktop nor the \
GTK+ libraries. \
 \
The primary goal of xiccd is providing colour profile support for \
desktop environments other than GNOME and KDE that do not support \
native colour management yet, such as MATE, Xfce, LXDE, to name a \
few."
LICENSE = "GPL-3.0-or-later"

PV = "0.3.0"

RPM_NAME = "xiccd-0.3.0-1.13.aarch64.rpm"
RPM_HASH = "0beb56f6c0c12f54368f7e7b1e4c24056329715045ca0911bde46e1baadd2a2bcfe936c39ed91df0144d8a2a001890d52a68274a25e14cce155434b7da267b0c"

RPROVIDES:${PN} += "xiccd \
xiccd(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXrandr.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcolord.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit)"

inherit rpm
