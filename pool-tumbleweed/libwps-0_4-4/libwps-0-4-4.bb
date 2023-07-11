SUMMARY = "Library for the Microsoft Works text and spreadsheet formats"
DESCRIPTION = "libwps is a library for importing the Microsoft Works word processor \
and spreadsheet file format."
LICENSE = "LGPL-2.1-or-later & MPL-2.0"

PV = "0.4.14"

RPM_NAME = "libwps-0_4-4-0.4.14-1.1.aarch64.rpm"
RPM_HASH = "bb633f38cce97d455c3da8d5debf01940197289b26f8a0853b6ec36bd87bff54fda26571d8d9cc6f733f8b912c300bdac15cc323816ef008956ace492a4fa2f9"

RPROVIDES:${PN} += "libwps-0-4-4 \
libwps-0.4.so.4"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
librevenge-0.0.so.0 \
libstdc++.so.6"

inherit rpm
