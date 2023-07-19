SUMMARY = "GUI for mediainfo"
DESCRIPTION = "This package contains a Frontend for mediainfo. \
 \
MediaInfo supplies technical and tag information about a video or \
audio file."
LICENSE = "GPL-2.0-or-later"

PV = "23.07"

RPM_NAME = "mediainfo-gui-23.07-1.1.aarch64.rpm"
RPM_HASH = "d523bfca37ca41f5d29da52a314acc14b3f45f4692ee2c8611a67397f4087dad441525f9571907bfc40982075ae2e01f2342785a4cb8577759f23fe6359699a5"

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
