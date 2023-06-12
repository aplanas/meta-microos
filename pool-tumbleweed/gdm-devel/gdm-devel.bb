SUMMARY = "Libraries for GDM -- Development Files"
DESCRIPTION = "The GNOME Display Manager is a system service that is responsible for \
providing graphical log-ins and managing local and remote displays."
LICENSE = "GPL-2.0-or-later"

PV = "44.1"

RPM_NAME = "gdm-devel-44.1-1.1.aarch64.rpm"
RPM_HASH = "980b8f6e96a3de740557445eebccf7c4be40fcbe33469dd6c58481aac7e6adbcc6b2e2fdb37dd7b96dcff2ca8e8abcc1d9c4fa24f8851a6704b3e4fda0d539a8"

RPROVIDES:${PN} += "gdm-devel \
gdm-devel(aarch-64) \
pkgconfig(gdm) \
pkgconfig(gdm-pam-extensions)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgdm1 \
pkgconfig(gio-2.0) \
pkgconfig(gio-unix-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gobject-2.0) \
pkgconfig(libselinux) \
pkgconfig(libsystemd) \
typelib-1_0-Gdm-1_0"

inherit rpm
