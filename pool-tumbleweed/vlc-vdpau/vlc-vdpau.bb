SUMMARY = "Additional vdpau codecs for the VLC media player"
DESCRIPTION = "This package enhances the functionality of the VLC media player by \
vdpau codecs that are not available in the stock openSUSE distribution."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-vdpau-3.0.18-7.1.aarch64.rpm"
RPM_HASH = "c2ab4a7679e9f4d7fb9a0d5027a7e34244425f373ba9832b5f366898dec73fbaf5ade2a81e0b5d3ed7e5b1d18b7642ae7bac6bc9b0400c387b7d9da57b0cb4bf"

RPROVIDES:${PN} += "libglconv-vdpau-plugin.so \
libvdpau-adjust-plugin.so \
libvdpau-avcodec-plugin.so \
libvdpau-chroma-plugin.so \
libvdpau-deinterlace-plugin.so \
libvdpau-display-plugin.so \
libvdpau-sharpen-plugin.so \
libvlc-vdpau.so.0 \
vlc-vdpau"

RDEPENDS:${PN} += "/bin/sh \
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
