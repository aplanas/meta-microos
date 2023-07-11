SUMMARY = "Label Editing and Printing Tool - Development Files"
DESCRIPTION = "Labels is a powerful tool for editing and printing all kinds of labels. \
It comes with a lot of templates of standard labels. \
 \
This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "3.4.1"

RPM_NAME = "glabels-devel-3.4.1-4.13.aarch64.rpm"
RPM_HASH = "9418ab0dfef1f74afc783fc5852129c944cbb444af9ecf354282c31210a9547a44edf55ae51256fac80a8353c91eef4d371d959e620d391b6f732ee656c389c0"

RPROVIDES:${PN} += "glabels-devel \
pkgconfig-libglabels-3.0 \
pkgconfig-libglbarcode-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glabels \
pkgconfig-cairo \
pkgconfig-glib-2.0 \
pkgconfig-gobject-2.0 \
pkgconfig-libxml-2.0 \
pkgconfig-pangocairo"

inherit rpm
