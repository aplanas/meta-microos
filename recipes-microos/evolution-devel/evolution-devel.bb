SUMMARY = "Development files for the Evolution groupware suite"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "CC-BY-SA-3.0 & LGPL-2.0-only & LGPL-3.0-only & OLDAP-2.8 & GFDL-1.1-only & GFDL-1.3-only"

PV = "3.48.1"

RPM_NAME = "evolution-devel-3.48.1-1.1.aarch64.rpm"
RPM_HASH = "01f7558956af607da3365803dcbbf5466f67ca7d2894a8550b035938655002f5e407f2e4f44feb1941af723715f60293bf697f082d38fcd0e656cd6f55434389"

RPROVIDES:${PN} += "evolution-devel evolution-devel(aarch-64) evolution2-devel pkgconfig(evolution-calendar-3.0) pkgconfig(evolution-mail-3.0) pkgconfig(evolution-shell-3.0) pkgconfig(libemail-engine)"
RDEPENDS:${PN} += "/usr/bin/pkg-config evolution evolution-data-server-devel pkgconfig(camel-1.2) pkgconfig(enchant-2) pkgconfig(evolution-shell-3.0) pkgconfig(gio-2.0) pkgconfig(gnome-desktop-3.0) pkgconfig(gtk+-3.0) pkgconfig(gtkspell3-3.0) pkgconfig(gweather4) pkgconfig(libebackend-1.2) pkgconfig(libedataserver-1.2) pkgconfig(libedataserverui-1.2) pkgconfig(libemail-engine) pkgconfig(libsoup-3.0) pkgconfig(libxml-2.0) pkgconfig(webkit2gtk-4.1)"

inherit rpm
