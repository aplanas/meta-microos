SUMMARY = "Additional vdpau codecs for the VLC media player"
DESCRIPTION = "This package enhances the functionality of the VLC media player by \
vdpau codecs that are not available in the stock openSUSE distribution."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-vdpau-3.0.18-7.3.aarch64.rpm"
RPM_HASH = "36f4c6995cfaa47cab4f2e8a1b682b2a4a2dd53903b7654b93408a6ba2f1c9cdd20bad8d675548b8682e057ab5c3d9b0b9822abcfe174ebd7aacd86dc14a95cb"

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
