SUMMARY = "Libraries for GDM -- Development Files"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gdm-devel-44.1-2.1.aarch64.rpm"
RPM_HASH = "fbe9a3d11b98acc77314fa03e196ad2aa07d1d2b18b03d3cd2db33f7d016931cf82552bc92907c4992bec31a2fbcf84ba51532dd9dd0abff5b1aa100fa7f8c83"

RPROVIDES:${PN} += "gdm-devel \
pkgconfig-gdm \
pkgconfig-gdm-pam-extensions"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgdm1 \
pkgconfig-gio-2.0 \
pkgconfig-gio-unix-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libselinux \
pkgconfig-libsystemd \
typelib-1-0-Gdm-1-0"

inherit rpm
