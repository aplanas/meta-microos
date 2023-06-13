SUMMARY = "Additional vdpau codecs for the VLC media player"
DESCRIPTION = "This package enhances the functionality of the VLC media player by \
vdpau codecs that are not available in the stock openSUSE distribution."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "3.0.18"

RPM_NAME = "vlc-vdpau-3.0.18-7.1.aarch64.rpm"
RPM_HASH = "c2ab4a7679e9f4d7fb9a0d5027a7e34244425f373ba9832b5f366898dec73fbaf5ade2a81e0b5d3ed7e5b1d18b7642ae7bac6bc9b0400c387b7d9da57b0cb4bf"

RPROVIDES:${PN} += "libglconv_vdpau_plugin.so()(64bit) \
libvdpau_adjust_plugin.so()(64bit) \
libvdpau_avcodec_plugin.so()(64bit) \
libvdpau_chroma_plugin.so()(64bit) \
libvdpau_deinterlace_plugin.so()(64bit) \
libvdpau_display_plugin.so()(64bit) \
libvdpau_sharpen_plugin.so()(64bit) \
libvlc_vdpau.so.0()(64bit) \
vlc-vdpau \
vlc-vdpau(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libX11.so.6()(64bit) \
libavcodec.so.58.134()(64bit) \
libavcodec.so.58.134(LIBAVCODEC_58)(64bit) \
libavutil.so.56.70()(64bit) \
libavutil.so.56.70(LIBAVUTIL_56)(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libvlc_xcb_events.so.0()(64bit) \
libvlccore.so.9()(64bit) \
libxcb.so.1()(64bit) \
vlc-noX"

inherit rpm
