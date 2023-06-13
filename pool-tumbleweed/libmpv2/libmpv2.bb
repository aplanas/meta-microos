SUMMARY = "A library to link together with mpv player"
DESCRIPTION = "mpv is a movie player based on MPlayer and mplayer2. It supports a wide variety \
of video file formats, audio and video codecs, and subtitle types. \
 \
This package contains a library that can other apps use to utilize the mpv \
features."
LICENSE = "GPL-2.0-or-later"

PV = "0.35.1+git.20230315.e1727553"

RPM_NAME = "libmpv2-0.35.1+git.20230315.e1727553-1.4.aarch64.rpm"
RPM_HASH = "e069c38b8700490c338a9b0fc2fd6cb7730f0161e2288b53763f973d38c35a5acf75240f48094420a2fb9a81dca4cba1f78fa045d8aaf22fb6f5587d9fb090bf"

RPROVIDES:${PN} += "libmpv.so.2()(64bit) \
libmpv2 \
libmpv2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libEGL.so.1()(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXpresent.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libXss.so.1()(64bit) \
libXv.so.1()(64bit) \
libarchive.so.13()(64bit) \
libasound.so.2()(64bit) \
libasound.so.2(ALSA_0.9)(64bit) \
libasound.so.2(ALSA_0.9.0rc4)(64bit) \
libass.so.9()(64bit) \
libavcodec.so.60()(64bit) \
libavcodec.so.60(LIBAVCODEC_60.3_SUSE)(64bit) \
libavdevice.so.60()(64bit) \
libavdevice.so.60(LIBAVDEVICE_60.1_SUSE)(64bit) \
libavfilter.so.9()(64bit) \
libavfilter.so.9(LIBAVFILTER_9.3_SUSE)(64bit) \
libavformat.so.60()(64bit) \
libavformat.so.60(LIBAVFORMAT_60.3_SUSE)(64bit) \
libavutil.so.58()(64bit) \
libavutil.so.58(LIBAVUTIL_58.2_SUSE)(64bit) \
libbluray.so.2()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcaca.so.0()(64bit) \
libcdio.so.19()(64bit) \
libcdio.so.19(CDIO_19)(64bit) \
libcdio_cdda.so.2()(64bit) \
libcdio_cdda.so.2(CDIO_CDDA_2)(64bit) \
libcdio_paranoia.so.2()(64bit) \
libcdio_paranoia.so.2(CDIO_PARANOIA_2)(64bit) \
libdrm.so.2()(64bit) \
libdvdnav.so.4()(64bit) \
libgbm.so.1()(64bit) \
libjack.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
liblcms2.so.2()(64bit) \
liblua5.1.so.5()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libopenal.so.1()(64bit) \
libpipewire-0.3.so.0()(64bit) \
libplacebo.so.264()(64bit) \
libpulse.so.0()(64bit) \
libpulse.so.0(PULSE_0)(64bit) \
librubberband.so.2()(64bit) \
libshaderc_shared.so.1()(64bit) \
libsixel.so.1()(64bit) \
libswresample.so.4()(64bit) \
libswresample.so.4(LIBSWRESAMPLE_4.10_SUSE)(64bit) \
libswscale.so.7()(64bit) \
libswscale.so.7(LIBSWSCALE_7.1_SUSE)(64bit) \
libuchardet.so.0()(64bit) \
libva-drm.so.2()(64bit) \
libva-wayland.so.2()(64bit) \
libva-x11.so.2()(64bit) \
libva.so.2()(64bit) \
libva.so.2(VA_API_0.33.0)(64bit) \
libvapoursynth-script.so.0()(64bit) \
libvdpau.so.1()(64bit) \
libvulkan.so.1()(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-cursor.so.0()(64bit) \
libwayland-egl.so.1()(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit) \
libz.so.1()(64bit) \
libzimg.so.2()(64bit)"

inherit rpm
