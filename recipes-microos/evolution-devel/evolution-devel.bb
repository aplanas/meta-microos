SUMMARY = "Development files for the Evolution groupware suite"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.48.2"

RPM_NAME = "evolution-devel-3.48.2-1.1.aarch64.rpm"
RPM_HASH = "a051693c52298ca3bdaf1f710e05d377543f2f0fe7f2317ef049ee687c8a2091b9f1903eaea524ac06b2316c6491448e41dce3b97ea6e46e0e0a48280a930e77"

RPROVIDES:${PN} += "evolution-devel \
evolution-devel(aarch-64) \
evolution2-devel \
pkgconfig(evolution-calendar-3.0) \
pkgconfig(evolution-mail-3.0) \
pkgconfig(evolution-shell-3.0) \
pkgconfig(libemail-engine)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
evolution \
evolution-data-server-devel \
pkgconfig(camel-1.2) \
pkgconfig(enchant-2) \
pkgconfig(evolution-shell-3.0) \
pkgconfig(gio-2.0) \
pkgconfig(gnome-desktop-3.0) \
pkgconfig(gtk+-3.0) \
pkgconfig(gtkspell3-3.0) \
pkgconfig(gweather4) \
pkgconfig(libebackend-1.2) \
pkgconfig(libedataserver-1.2) \
pkgconfig(libedataserverui-1.2) \
pkgconfig(libemail-engine) \
pkgconfig(libsoup-3.0) \
pkgconfig(libxml-2.0) \
pkgconfig(webkit2gtk-4.1)"

inherit rpm
