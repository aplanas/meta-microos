SUMMARY = "Advanced general-purpose multimedia player"
DESCRIPTION = "mpv is a movie player based on MPlayer and mplayer2. It supports a wide variety \
of video file formats, audio and video codecs, and subtitle types."
LICENSE = "GPL-2.0-or-later"

PV = "0.36.0+git20230826.83c0e980"

RPM_NAME = "mpv-0.36.0+git20230826.83c0e980-1.1.aarch64.rpm"
RPM_HASH = "afe2c7ff1859dbb87063c900abfe4d90528d14cb81d3a0e888be25437ef1833f22b2789faeee17a8646ed99c7ed06799bf0b37114598bc4a852ea3031013ce0d"

RPROVIDES:${PN} += "config-mpv \
mplayer2 \
mpv"

RDEPENDS:${PN} += "hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libEGL.so.1 \
libX11.so.6 \
libXext.so.6 \
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
libplacebo.so.292 \
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
libzimg.so.2 \
update-desktop-files"

inherit rpm
