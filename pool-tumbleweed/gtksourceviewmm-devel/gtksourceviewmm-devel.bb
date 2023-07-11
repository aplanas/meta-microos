SUMMARY = "Development files for the gtksourceview C++ interface"
DESCRIPTION = "gtksourceviewmm provides a C++ interface to the gtksourceview library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.91.1"

RPM_NAME = "gtksourceviewmm-devel-3.91.1-1.17.aarch64.rpm"
RPM_HASH = "4b73ab6541f5382763283c1a2a0b5b934d5985a4330b74c81c4e82fd9c6f71372e0f4da97b91d1477f1ba3de269d7348a31a5ffcc37c645e92e96beef00b1ae8"

RPROVIDES:${PN} += "gtksourceviewmm-devel \
pkgconfig-gtksourceviewmm-4.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtksourceviewmm-4-0-0 \
pkgconfig-glibmm-2.4 \
pkgconfig-gtkmm-3.0 \
pkgconfig-gtksourceview-4"

inherit rpm
