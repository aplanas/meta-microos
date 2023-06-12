SUMMARY = "A library to link together with mpv player"
DESCRIPTION = "mpv is a movie player based on MPlayer and mplayer2. It supports a wide variety \
of video file formats, audio and video codecs, and subtitle types. \
 \
This package contains all the development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.35.1+git.20230315.e1727553"

RPM_NAME = "mpv-devel-0.35.1+git.20230315.e1727553-1.4.aarch64.rpm"
RPM_HASH = "7d79af4db5fa87d0ea7c0d407c59d1d577652cc5bf77fe7ebfdda7ef6517da062aa61e04aec8eae24edd66a2867015980edda95760e1f6b518ba4a229940c774"

RPROVIDES:${PN} += "mpv-devel \
mpv-devel(aarch-64) \
pkgconfig(mpv)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmpv2 \
pkgconfig(alsa) \
pkgconfig(caca) \
pkgconfig(dvdnav) \
pkgconfig(dvdread) \
pkgconfig(egl) \
pkgconfig(ffnvcodec) \
pkgconfig(gbm) \
pkgconfig(jack) \
pkgconfig(lcms2) \
pkgconfig(libarchive) \
pkgconfig(libass) \
pkgconfig(libavcodec) \
pkgconfig(libavdevice) \
pkgconfig(libavfilter) \
pkgconfig(libavformat) \
pkgconfig(libavutil) \
pkgconfig(libbluray) \
pkgconfig(libcdio_paranoia) \
pkgconfig(libdrm) \
pkgconfig(libjpeg) \
pkgconfig(libpipewire-0.3) \
pkgconfig(libplacebo) \
pkgconfig(libpulse) \
pkgconfig(libsixel) \
pkgconfig(libswresample) \
pkgconfig(libswscale) \
pkgconfig(libva) \
pkgconfig(libva-drm) \
pkgconfig(libva-wayland) \
pkgconfig(libva-x11) \
pkgconfig(lua) \
pkgconfig(mujs) \
pkgconfig(openal) \
pkgconfig(rubberband) \
pkgconfig(shaderc) \
pkgconfig(uchardet) \
pkgconfig(vapoursynth) \
pkgconfig(vapoursynth-script) \
pkgconfig(vdpau) \
pkgconfig(vulkan) \
pkgconfig(wayland-client) \
pkgconfig(wayland-cursor) \
pkgconfig(wayland-egl) \
pkgconfig(wayland-protocols) \
pkgconfig(x11) \
pkgconfig(xext) \
pkgconfig(xinerama) \
pkgconfig(xkbcommon) \
pkgconfig(xpresent) \
pkgconfig(xrandr) \
pkgconfig(xscrnsaver) \
pkgconfig(xv) \
pkgconfig(zimg) \
pkgconfig(zlib)"

inherit rpm
