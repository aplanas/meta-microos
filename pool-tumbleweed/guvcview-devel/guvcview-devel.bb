SUMMARY = "Development files for guvcview"
DESCRIPTION = "A GTK interface for capturing and viewing video from devices \
supported by the Linux UVC driver, although it should also work with \
any v4l2 compatible device. \
 \
This subpackage contains the header files for developing \
applications that want to make use of the GUVC libraries."
LICENSE = "GPL-3.0-only"

PV = "2.0.8"

RPM_NAME = "guvcview-devel-2.0.8-1.7.aarch64.rpm"
RPM_HASH = "46a57113a77044ce4f51f0bacbf9ddf36295cb1a9b5e4d02e7643875427e8dcfe3410acea94a37e8e6e9c27faf7fb3391b0bc86c4dbc6cab7ba6d7f97bab1c90"

RPROVIDES:${PN} += "guvcview-devel \
pkgconfig-libgviewaudio \
pkgconfig-libgviewencoder \
pkgconfig-libgviewrender \
pkgconfig-libgviewv4l2core"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
alsa-devel \
glibc-devel \
gsl-devel \
libSDL2-devel \
libgviewaudio-2-0-2 \
libgviewencoder-2-1-2 \
libgviewrender-2-1-2 \
libgviewv4l2core-2-1-2 \
libpng-devel \
libpulse-devel \
libudev-devel \
libusb-1-0-devel \
libv4l-devel \
pkgconfig-libavcodec \
pkgconfig-libavutil \
portaudio-devel"

inherit rpm
