SUMMARY = "Window Manager with a Taskbar -- Default Version"
DESCRIPTION = "A window manager for the X Window System that can emulate the look \
of Windows '95, OS/2 Warp 3, OS/2 Warp 4, and Motif and tries to \
take the best features from those systems. IceWM features multiple \
workspaces, opaque move and resize, a taskbar, a window list, \
mailbox status, and a digital clock. It is fast and small."
LICENSE = "LGPL-2.1-or-later"

PV = "3.3.5"

RPM_NAME = "icewm-default-3.3.5-1.1.aarch64.rpm"
RPM_HASH = "b2e37ef36736b319ee89ddbca4e84fa147b03f96b8b253b7719308774b151e3f92ab72b1cdcdf32eb5a0eaf5fb02d051652b9a16a402f3eca6d64fea73635629"

RPROVIDES:${PN} += "icewm-bin \
icewm-default \
icewm-default(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/perl \
adwaita-icon-theme \
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
libasound.so.2()(64bit) \
libc.so.6()(64bit) \
libfribidi.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libsndfile.so.1()(64bit) \
libstdc++.so.6()(64bit) \
update-alternatives"

inherit rpm
