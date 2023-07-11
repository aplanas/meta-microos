SUMMARY = "GUI for mediainfo"
DESCRIPTION = "This package contains a Frontend for mediainfo. \
 \
MediaInfo supplies technical and tag information about a video or \
audio file."
LICENSE = "GPL-2.0-or-later"

PV = "23.06"

RPM_NAME = "mediainfo-gui-23.06-1.1.aarch64.rpm"
RPM_HASH = "181fa41bc1c95898b4b723aeffd1a1543f5e046de66a9dcb2b5bb4b6938ee472179618816e34a5364afa921dc15fd704889c5edfbdee61e680577d09877b14c6"

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
