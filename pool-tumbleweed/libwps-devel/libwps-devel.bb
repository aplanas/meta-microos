SUMMARY = "Files for Developing with libwps"
DESCRIPTION = "libwps is a library for importing the Microsoft Works word processor \
and spreadsheet file format. \
 \
This package contains the libwps development files."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.4.13"

RPM_NAME = "libwps-devel-0.4.13-1.3.aarch64.rpm"
RPM_HASH = "56c50a8d58e2726a698709952a8b2f2e9721921b102d91dc3782d7f7cf406d4d1bc193b523e8ecae495771e25c53846682dab8daffd72d06299e0d2f3ce55099"

RPROVIDES:${PN} += "libwps-devel \
pkgconfig-libwps-0.4"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwps-0-4-4 \
pkgconfig-librevenge-0.0"

inherit rpm
