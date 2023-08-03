SUMMARY = "A library to link together with mpv player"
DESCRIPTION = "mpv is a movie player based on MPlayer and mplayer2. It supports a wide variety \
of video file formats, audio and video codecs, and subtitle types. \
 \
This package contains all the development files."
LICENSE = "GPL-2.0-or-later"

PV = "0.36.0+git.20230723.60a26324"

RPM_NAME = "mpv-devel-0.36.0+git.20230723.60a26324-1.1.aarch64.rpm"
RPM_HASH = "361130d20f8a2a1c75f463ec1c841c4fbd0edcd6d2ede667fc0c3b31a2800fbf2e1e76293cb9e100d240c7e200b77fb020314b11ddfdccf5155b77709d378150"

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
