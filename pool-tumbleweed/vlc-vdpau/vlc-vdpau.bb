SUMMARY = "Additional vdpau codecs for the VLC media player"
DESCRIPTION = "This package enhances the functionality of the VLC media player by \
vdpau codecs that are not available in the stock openSUSE distribution."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-vdpau-3.0.18-9.2.aarch64.rpm"
RPM_HASH = "4ae7c372a6868a7cc4ed69233fd700bb1149361f96f7a2a312539c72196e6906f5ee75ba20e100c0ac16e132b6e52cea368caa0d1d5bc4c21f504bb9ce09818d"

RPROVIDES:${PN} += "libglconv-vdpau-plugin.so \
libvdpau-adjust-plugin.so \
libvdpau-avcodec-plugin.so \
libvdpau-chroma-plugin.so \
libvdpau-deinterlace-plugin.so \
libvdpau-display-plugin.so \
libvdpau-sharpen-plugin.so \
libvlc-vdpau.so.0 \
vlc-vdpau"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libavcodec.so.58.134 \
libavutil.so.56.70 \
libc.so.6 \
libm.so.6 \
libvlc-xcb-events.so.0 \
libvlccore.so.9 \
libxcb.so.1 \
vlc-noX"

inherit rpm
