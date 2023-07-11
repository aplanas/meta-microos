SUMMARY = "Development files for the gtksourceview C++ interface"
DESCRIPTION = "gtksourceviewmm provides a C++ interface to the gtksourceview library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.21.3"

RPM_NAME = "gtksourceviewmm3_0-devel-3.21.3-1.16.aarch64.rpm"
RPM_HASH = "135d6f5cf9668b47e45c64cbfd7544d6949d165b97e8ffb8adc153f3f92f1b26b520f05b9d519d85b026d0adee073a7fbd722775536faa028050d1e3c05c227b"

RPROVIDES:${PN} += "gtksourceviewmm3-0-devel \
pkgconfig-gtksourceviewmm-3.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtksourceviewmm-3-0-0 \
pkgconfig-glibmm-2.4 \
pkgconfig-gtkmm-3.0 \
pkgconfig-gtksourceview-3.0"

inherit rpm
