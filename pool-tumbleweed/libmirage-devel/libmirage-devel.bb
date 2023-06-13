SUMMARY = "Development files for libmirage, a CD-ROM image access library"
DESCRIPTION = "A CD-ROM image access library part of the cdemu suite. \
 \
libmirage provides uniform access to the data stored in different \
image formats by creating a representation of disc stored in image \
file. \
 \
This package contains files needed to develop with libmirage."
LICENSE = "GPL-2.0-or-later"

PV = "3.2.6"

RPM_NAME = "libmirage-devel-3.2.6-1.8.aarch64.rpm"
RPM_HASH = "543b70f1c064dd9c3fa43855ca1e876e470124a13ffe2476e26a7c1b858072e4303ddf8877281769db111a34a65e9879a826312e8edaf820d7d9383ea320f9f6"

RPROVIDES:${PN} += "libmirage-devel \
libmirage-devel(aarch-64) \
pkgconfig(libmirage)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libmirage11 \
pkgconfig(gio-2.0) \
pkgconfig(glib-2.0) \
pkgconfig(gmodule-2.0) \
pkgconfig(gobject-2.0)"

inherit rpm
