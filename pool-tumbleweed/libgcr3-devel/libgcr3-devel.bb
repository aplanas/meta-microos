SUMMARY = "Development files for gcr, a library for crypto UI related tasks"
DESCRIPTION = "GCR is a library for displaying certificates, and crypto UI, accessing \
key stores."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "libgcr3-devel-3.41.0-3.4.aarch64.rpm"
RPM_HASH = "4e18cb3ad7edbece2c42f2e550ea89c771e266dac83f1a549102708c07d19e6dd46dcd8486467b1b966a718f2187880f0953c1f9f75840e898a3777ab2c0d407"

RPROVIDES:${PN} += "libgcr3-devel \
pkgconfig-gcr-3 \
pkgconfig-gcr-base-3 \
pkgconfig-gcr-ui-3"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgcr-3-1 \
pkgconfig-gck-1 \
pkgconfig-gcr-base-3 \
pkgconfig-gcr-ui-3 \
pkgconfig-gio-2.0 \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-gtk+-3.0 \
pkgconfig-p11-kit-1 \
typelib-1-0-Gcr-3 \
typelib-1-0-GcrUi-3"

inherit rpm
