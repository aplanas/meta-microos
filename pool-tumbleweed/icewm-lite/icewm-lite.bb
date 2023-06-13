SUMMARY = "Window Manager with a Taskbar -- Lite Version"
DESCRIPTION = "A window manager for the X Window System that can emulate the look \
of Windows '95, OS/2 Warp 3, OS/2 Warp 4, and Motif and tries to \
take the best features from those systems. IceWM features multiple \
workspaces, opaque move and resize, a taskbar, a window list, \
mailbox status, and a digital clock. It is fast and small."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.5"

RPM_NAME = "icewm-lite-3.3.5-1.1.aarch64.rpm"
RPM_HASH = "a87e1c4897378e3e06646cb58677dbfdbad4edd4487b0ac156db54bf50cc09740952523ea0416988d43260b7ab182461620c18b98c35632329c8053620287c3f"

RPROVIDES:${PN} += "icewm-bin \
icewm-lite \
icewm-lite(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
icewm \
ld-linux-aarch64.so.1()(64bit) \
libICE.so.6()(64bit) \
libImlib2.so.1()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libXcomposite.so.1()(64bit) \
libXdamage.so.1()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXft.so.2()(64bit) \
libXinerama.so.1()(64bit) \
libXpm.so.4()(64bit) \
libXrandr.so.2()(64bit) \
libXrender.so.1()(64bit) \
libc.so.6()(64bit) \
libgcc_s.so.1()(64bit) \
libstdc++.so.6()(64bit) \
update-alternatives"

inherit rpm
