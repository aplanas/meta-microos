SUMMARY = "Development files for the MATE panel applet library"
DESCRIPTION = "This package contains the MATE Desktop Panel. The panel is an \
interface to manage the desktop, launch applications, and organise \
access to data."
LICENSE = "GPL-2.0-or-later"

PV = "1.26.3"

RPM_NAME = "mate-panel-devel-1.26.3-1.1.aarch64.rpm"
RPM_HASH = "b99b0bfd2e6c5d34cfeff571e0fab80a7fe1dd07576349ddaab3c7215cb802bc4cc3d0bb0206cc0126412467e5c354a530ae9985970acddcea6fbd2769ee21af"

RPROVIDES:${PN} += "mate-panel-devel \
pkgconfig-libmatepanelapplet-4.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmate-panel-applet-4-1 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gtk+-3.0 \
typelib-1-0-MatePanelApplet-4-0"

inherit rpm
