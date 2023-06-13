SUMMARY = "3D Networked Multiplayer Tank Battle Game"
DESCRIPTION = "BZFlag is a 3D multiplayer tank battle game that allows users to play \
against each other in a networked environment. Because it makes heavy \
use of 3D graphics (OpenGL), a fast CPU or a supported 3D video card is \
heavily recommended. \
 \
Find server maps in /usr/share/bzflag/maps."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.26"

RPM_NAME = "bzflag-2.4.26-1.3.aarch64.rpm"
RPM_HASH = "bcaecdde8d63f9e5e5e5afec287ce33cf740361af8056ec435c7620005ce1554bc1ff0be006cd622bef97e927e24dfc2ff90606f51738a89ca503f2eaee6d700"

RPROVIDES:${PN} += "application() \
application(bzflag.desktop) \
bzflag \
bzflag(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/touch \
fillup \
ld-linux-aarch64.so.1()(64bit) \
libGL.so.1()(64bit) \
libGLEW.so.2.2()(64bit) \
libGLU.so.1()(64bit) \
libSDL2-2.0.so.0()(64bit) \
libc.so.6()(64bit) \
libcares.so.2()(64bit) \
libcurl.so.4()(64bit) \
libgcc_s.so.1()(64bit) \
libm.so.6()(64bit) \
libncurses.so.6()(64bit) \
libstdc++.so.6()(64bit) \
libtinfo.so.6()(64bit) \
libz.so.1()(64bit)"

inherit rpm
