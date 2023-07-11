SUMMARY = "Files needed to build wrappers for GTK+ addon libraries"
DESCRIPTION = "This package contains files required to build wrappers for GTK+ addon \
libraries so that they interoperate with pygtk."
LICENSE = "LGPL-2.1-or-later"

PV = "2.24.0"

RPM_NAME = "python-gtk-devel-2.24.0-22.9.aarch64.rpm"
RPM_HASH = "148bb80e114cdc1c8c07948da73adaf9d72d1484ba236e918fd9afa1a9f1e1a1f130ec0ede3d6eee90ab828430565a2d52e4be5d5153d5071a74c29458b3b0fb"

RPROVIDES:${PN} += "pkgconfig-pygtk-2.0 \
python-gtk-devel \
python2-gtk-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/python \
/usr/bin/python2 \
/usr/bin/sh \
pkgconfig-gtk+-2.0 \
pkgconfig-pygobject-2.0 \
python-cairo-devel \
python-gobject2-devel \
python-gtk"

inherit rpm
