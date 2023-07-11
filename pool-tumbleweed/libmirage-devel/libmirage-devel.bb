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

RPM_NAME = "libmirage-devel-3.2.6-1.9.aarch64.rpm"
RPM_HASH = "e7cb9c10fe4c221e9665334a2ff3eca1f96f550e355472a0a7c8152bdde12b97711cf9cad96b957b0b72362062ebb35c5ee8563a47f11d964487209de9b34f24"

RPROVIDES:${PN} += "libmirage-devel \
pkgconfig-libmirage"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glib2-devel \
libmirage11 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gmodule-2.0 \
pkgconfig-gobject-2.0"

inherit rpm
