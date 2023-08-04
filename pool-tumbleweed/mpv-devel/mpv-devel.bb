SUMMARY = "A library to link together with mpv player"
DESCRIPTION = "mpv is a movie player based on MPlayer and mplayer2. It supports a wide variety \
of video file formats, audio and video codecs, and subtitle types. \
 \
This package contains all the development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.36.0+git.20230723.60a26324"

RPM_NAME = "mpv-devel-0.36.0+git.20230723.60a26324-1.2.aarch64.rpm"
RPM_HASH = "fa4903caa7facb66e7cac7b4083ee4c2b629e9b0cbfbd30fbde8b4a0ca1719fbce41af8368139aef0bd9bafa6f2bd51de9d8a77ca578c97918aa21e6fc657da4"

RPROVIDES:${PN} += "mpv-devel \
pkgconfig-mpv"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmpv2 \
pkgconfig-alsa \
pkgconfig-caca \
pkgconfig-dvdnav \
pkgconfig-dvdread \
pkgconfig-egl \
pkgconfig-ffnvcodec \
pkgconfig-gbm \
pkgconfig-jack \
pkgconfig-lcms2 \
pkgconfig-libarchive \
pkgconfig-libass \
pkgconfig-libavcodec \
pkgconfig-libavdevice \
pkgconfig-libavfilter \
pkgconfig-libavformat \
pkgconfig-libavutil \
pkgconfig-libbluray \
pkgconfig-libcdio-paranoia \
pkgconfig-libdrm \
pkgconfig-libjpeg \
pkgconfig-libpipewire-0.3 \
pkgconfig-libplacebo \
pkgconfig-libpulse \
pkgconfig-libsixel \
pkgconfig-libswresample \
pkgconfig-libswscale \
pkgconfig-libva \
pkgconfig-libva-drm \
pkgconfig-libva-wayland \
pkgconfig-libva-x11 \
pkgconfig-lua \
pkgconfig-mujs \
pkgconfig-openal \
pkgconfig-rubberband \
pkgconfig-shaderc \
pkgconfig-uchardet \
pkgconfig-vapoursynth \
pkgconfig-vapoursynth-script \
pkgconfig-vdpau \
pkgconfig-vulkan \
pkgconfig-wayland-client \
pkgconfig-wayland-cursor \
pkgconfig-wayland-egl \
pkgconfig-wayland-protocols \
pkgconfig-x11 \
pkgconfig-xext \
pkgconfig-xinerama \
pkgconfig-xkbcommon \
pkgconfig-xpresent \
pkgconfig-xrandr \
pkgconfig-xscrnsaver \
pkgconfig-xv \
pkgconfig-zimg \
pkgconfig-zlib"

inherit rpm
