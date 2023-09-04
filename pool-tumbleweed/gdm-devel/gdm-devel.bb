SUMMARY = "Libraries for GDM -- Development Files"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gdm-devel-44.1-3.1.aarch64.rpm"
RPM_HASH = "537146fc24c33bb5c2e7abd86fbab699a7798207dad060ebf1197027bbbdc89914b2f8a87272a1ae0daf4ae21c53110ab30548644c592e90a33e0ac0b83a9cd5"

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
