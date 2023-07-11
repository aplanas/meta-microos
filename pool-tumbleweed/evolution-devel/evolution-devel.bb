SUMMARY = "Development files for the Evolution groupware suite"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.48.4"

RPM_NAME = "evolution-devel-3.48.4-1.1.aarch64.rpm"
RPM_HASH = "8697fbe34af8699920f8c8a0d91a262de637fc0658a045140ed2abfafe635100bd16bc5698b8ed0e882c0f7ebf1df32ede2d4adfb3bba933bdccdb75f51d3b72"

RPROVIDES:${PN} += "evolution-devel \
evolution2-devel \
pkgconfig-evolution-calendar-3.0 \
pkgconfig-evolution-mail-3.0 \
pkgconfig-evolution-shell-3.0 \
pkgconfig-libemail-engine"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
evolution \
evolution-data-server-devel \
pkgconfig-camel-1.2 \
pkgconfig-enchant-2 \
pkgconfig-evolution-shell-3.0 \
pkgconfig-gio-2.0 \
pkgconfig-gnome-desktop-3.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-gtkspell3-3.0 \
pkgconfig-gweather4 \
pkgconfig-libebackend-1.2 \
pkgconfig-libedataserver-1.2 \
pkgconfig-libedataserverui-1.2 \
pkgconfig-libemail-engine \
pkgconfig-libsoup-3.0 \
pkgconfig-libxml-2.0 \
pkgconfig-webkit2gtk-4.1"

inherit rpm
