SUMMARY = "Development files for vala-panel"
DESCRIPTION = "Vala Panel is a desktop panel written in Vala and Gtk3. \
 \
This is a development package for vala-panel."
LICENSE = "GPL-3.0-or-later"

PV = "0.5.0"

RPM_NAME = "vala-panel-devel-0.5.0-1.7.aarch64.rpm"
RPM_HASH = "12edac4a1823aba1a433d5991ab34bb43e812199ebc5b986a96571202c8260ade3c60dcbd28664df4b46dd0f829582c99487e02465bd784ab4a60040f99ada59"

RPROVIDES:${PN} += "pkgconfig-vala-panel \
vala-panel-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libpeas-1.0 \
pkgconfig-libwnck-3.0 \
vala-panel"

inherit rpm
