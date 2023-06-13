SUMMARY = "Files needed to build wrappers for GTK+ addon libraries"
DESCRIPTION = "This package contains files required to build wrappers for GTK+ addon \
libraries so that they interoperate with pygtk."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.0"

RPM_NAME = "python-gtk-devel-2.24.0-22.8.aarch64.rpm"
RPM_HASH = "faf1a08ec25e73230438eef0714f23d16c610a82d9f6c3dcee137905ecc3ad46ad62ba9784c313b24717e69f773a7ba84034cadae15e7f23ebb2a31f80c91129"

RPROVIDES:${PN} += "pkgconfig(pygtk-2.0) \
python-gtk-devel \
python-gtk-devel(aarch-64) \
python2-gtk-devel"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/pkg-config \
/usr/bin/python \
/usr/bin/python2 \
pkgconfig(gtk+-2.0) \
pkgconfig(pygobject-2.0) \
python-cairo-devel \
python-gobject2-devel \
python-gtk"

inherit rpm
