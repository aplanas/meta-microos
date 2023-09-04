SUMMARY = "Additional vdpau codecs for the VLC media player"
DESCRIPTION = "This package enhances the functionality of the VLC media player by \
vdpau codecs that are not available in the stock openSUSE distribution."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-vdpau-3.0.18-9.1.aarch64.rpm"
RPM_HASH = "f52f62aa2f0dbd89dd6d93aab780dfd1cf3c22f63de47710e19afeacb39fedd1af5236b7b4a190153f54b72a76187f56dd23cabfa7dc454327195ceb5a08842f"

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
