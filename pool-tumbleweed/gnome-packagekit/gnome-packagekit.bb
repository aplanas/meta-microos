SUMMARY = "Applications for the PackageKit API"
DESCRIPTION = "GNOME PackageKit provides session applications for the PackageKit API. \
There are several utilities designed for installing, updating and \
removing packages on your system."
LICENSE = "GPL-2.0-or-later"

PV = "43.0"

RPM_NAME = "gnome-packagekit-43.0-1.3.aarch64.rpm"
RPM_HASH = "cb24504d09b0ca16380e6a8e112caf96d57be647439d307699c496d5fb2d16f716206c0cb7463f7d683864d65f3afed98713b6f838677b47f7e4f6246bf58fb2"

RPROVIDES:${PN} += "gnome-packagekit \
opensuse-updater-gnome \
org.freedesktop.PackageKit.service"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgdk-3.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libpackagekit-glib2.so.18 \
libpolkit-gobject-1.so.0"

inherit rpm
