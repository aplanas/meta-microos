SUMMARY = "Development files for the Plank dock"
DESCRIPTION = "The libxnoise development package includes the header files, libraries, \
configuration files and development tools necessary for compiling and \
linking application which will use libplank."
LICENSE = "GPL-3.0-or-later"

PV = "0.11.89"

RPM_NAME = "plank-devel-0.11.89-2.5.aarch64.rpm"
RPM_HASH = "ca27c636e11de4f770e86f1f960c3d8fc0fc598f8894a0225d31eb847b258b051f2a570824e683d2deace1f67b35bb24598d0b4b284f5b1a0366a63dbe38085b"

RPROVIDES:${PN} += "pkgconfig-plank \
plank-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libplank1 \
pkgconfig-cairo \
pkgconfig-gdk-3.0 \
pkgconfig-gdk-pixbuf-2.0 \
pkgconfig-gee-0.8 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-libbamf3"

inherit rpm
