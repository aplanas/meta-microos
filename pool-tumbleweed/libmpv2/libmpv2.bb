SUMMARY = "A library to link together with mpv player"
DESCRIPTION = "mpv is a movie player based on MPlayer and mplayer2. It supports a wide variety \
of video file formats, audio and video codecs, and subtitle types. \
 \
This package contains a library that can other apps use to utilize the mpv \
features."
LICENSE = "GPL-2.0-or-later"

PV = "0.36.0+git.20230723.60a26324"

RPM_NAME = "libmpv2-0.36.0+git.20230723.60a26324-1.1.aarch64.rpm"
RPM_HASH = "da82b38e09dc04b25228ff23a0ea036e6bb89bbabe63cf0b890373393cc95e650d66bb49ac4e08ef44e8806814a47d309d2637c77d5d304d2274d8ee89700dcd"

RPROVIDES:${PN} += "libmpv.so.2 \
libmpv2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXpresent.so.1 \
libXrandr.so.2 \
libXss.so.1 \
libXv.so.1 \
libarchive.so.13 \
libasound.so.2 \
libass.so.9 \
libavcodec.so.60 \
libavdevice.so.60 \
libavfilter.so.9 \
libavformat.so.60 \
libavutil.so.58 \
libbluray.so.2 \
libc.so.6 \
libcaca.so.0 \
libcdio-cdda.so.2 \
libcdio-paranoia.so.2 \
libcdio.so.19 \
libdrm.so.2 \
libdvdnav.so.4 \
libgbm.so.1 \
libjack.so.0 \
libjpeg.so.8 \
liblcms2.so.2 \
liblua5.1.so.5 \
libm.so.6 \
libopenal.so.1 \
libpipewire-0.3.so.0 \
libplacebo.so.264 \
libpulse.so.0 \
librubberband.so.2 \
libshaderc-shared.so.1 \
libsixel.so.1 \
libswresample.so.4 \
libswscale.so.7 \
libuchardet.so.0 \
libva-drm.so.2 \
libva-wayland.so.2 \
libva-x11.so.2 \
libva.so.2 \
libvapoursynth-script.so.0 \
libvdpau.so.1 \
libvulkan.so.1 \
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libwayland-egl.so.1 \
libxkbcommon.so.0 \
libz.so.1 \
libzimg.so.2"

inherit rpm
