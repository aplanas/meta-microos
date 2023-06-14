SUMMARY = "GUI for mediainfo"
DESCRIPTION = "This package contains a Frontend for mediainfo. \
 \
MediaInfo supplies technical and tag information about a video or \
audio file."
LICENSE = "GPL-2.0-or-later"

PV = "23.04"

RPM_NAME = "mediainfo-gui-23.04-1.2.aarch64.rpm"
RPM_HASH = "b7ccb9faf370729a76004c92f92389907a0afd6eda9077809366b42d54c64a984d8a8bc6e83b6406c07c3598c264e2932043c927d9445a1beff20f0b84e2e111"

RPROVIDES:${PN} += "MediaInfo-gui \
mediainfo-gui"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libmediainfo.so.0 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0 \
libwx-gtk2u-html-suse.so.9.0.0 \
libzen.so.0"

inherit rpm
