SUMMARY = "A GIO-style async APIs for most Flatpak portals -- Development files"
DESCRIPTION = "The libportal-gtk4-devel package contains libraries, build data, and \
header files for developing applications that use libportal."
LICENSE = "LGPL-3.0-or-later"

PV = "0.6"

RPM_NAME = "libportal-gtk4-devel-0.6-1.7.aarch64.rpm"
RPM_HASH = "db4b0241755d17d340d31082774ed1fe2643cc0ab44f937459fe3ac12064934476aa1b3b7f520b568cb2301365bbd71a3e270b60c51436f8b9fd50d86ffe31b5"

RPROVIDES:${PN} += "libportal-gtk4-devel \
libportal-gtk4-devel(aarch-64) \
pkgconfig(libportal-gtk4)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libportal-gtk4-1 \
pkgconfig(gio-2.0) \
pkgconfig(gio-unix-2.0) \
pkgconfig(gtk4) \
pkgconfig(libportal) \
typelib-1_0-XdpGtk4-1_0"

inherit rpm
