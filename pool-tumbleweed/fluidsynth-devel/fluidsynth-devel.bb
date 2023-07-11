SUMMARY = "Development package for the fluidsynth library"
DESCRIPTION = "This package contains the files needed to compile programs that use the \
fluidsynth library."
LICENSE = "LGPL-2.1-or-later"

PV = "2.3.3"

RPM_NAME = "fluidsynth-devel-2.3.3-1.1.aarch64.rpm"
RPM_HASH = "62b6b2fa3b2a97e9e74744ae3e972754c355089b7057214865e654d2c8e4960b66304edd2734fed04c5c4e0dffdd190341bf48726a12fb6d014c8d28c9eb0276"

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
