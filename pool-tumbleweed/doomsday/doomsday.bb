SUMMARY = "The Doomsday Engine: DOOM/Hertic/Hexen port with pretty graphics"
DESCRIPTION = "The Doomsday Engine is a source port with support for Doom, Heretic, \
and Hexen. It does not support BOOM extensions."
LICENSE = "GPL-2.0-or-later & GPL-2.0-only & SUSE-GPL-2.0-with-linking-exception & BSD-3-Clause & LGPL-3.0-or-later"

PV = "2.2.2"

RPM_NAME = "doomsday-2.2.2-4.4.aarch64.rpm"
RPM_HASH = "1b9083268a517436514bae795f64954d8d1c7236456188213625e2e74ae70bd36229b881c6bfe7ab36ef488e22c85038e85092f47e97da3e06d1ec112ed8454b"

RPROVIDES:${PN} += "bundled-assimp \
config-doomsday \
deng \
doomsday \
jdoom \
jheretic \
jhexen \
libaudio-fluidsynth.so \
libaudio-openal.so \
libdeng-appfw.so.2.2 \
libdeng-core.so.2.2 \
libdeng-doomsday.so.2.2 \
libdeng-gamefw.so.2.2 \
libdeng-gui.so.2.2 \
libdeng-legacy.so.2.2 \
libdeng-shell.so.2.2 \
libdoom.so \
libdoom64.so \
libheretic.so \
libhexen.so \
libimportdeh.so \
libimportidtech1.so \
libimportsave.so \
libimportudmf.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/sh \
Mesa-libGL1 \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Network.so.5 \
libQt5Widgets.so.5 \
libQt5X11Extras.so.5 \
libSDL2-2.0.so.0 \
libSDL2-mixer-2.0.so.0 \
libX11.so.6 \
libXrandr.so.2 \
libXxf86vm.so.1 \
libc.so.6 \
libfluidsynth.so.2 \
libgcc-s.so.1 \
libm.so.6 \
libminizip.so.1 \
libncurses.so.6 \
libopenal.so.1 \
libstdc++.so.6 \
libtinfo.so.6 \
libz.so.1"

inherit rpm
