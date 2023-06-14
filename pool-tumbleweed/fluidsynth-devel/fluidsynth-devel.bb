SUMMARY = "Development package for the fluidsynth library"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
fluidsynth library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.1"

RPM_NAME = "fluidsynth-devel-2.3.1-2.3.aarch64.rpm"
RPM_HASH = "cef93b3d8b9e67bb3117221ecfbdbd4bd8921cfac6f95dfce4b5ef5b891c3fab40933fd8cd076ee4ba19f03ade1819ca6115dfff819681929e33528e72af7a0c"

RPROVIDES:${PN} += "cmake-FluidSynth \
fluidsynth-devel \
libfluidsynth-devel \
pkgconfig-fluidsynth"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libfluidsynth3 \
pkgconfig-alsa \
pkgconfig-dbus-1 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gthread-2.0 \
pkgconfig-jack \
pkgconfig-libinstpatch-1.0 \
pkgconfig-libpulse-simple \
pkgconfig-libsystemd \
pkgconfig-readline \
pkgconfig-sdl2 \
pkgconfig-sndfile"

inherit rpm
