SUMMARY = "Development files for the gtksourceview C++ interface"
DESCRIPTION = "gtksourceviewmm provides a C++ interface to the gtksourceview library."
LICENSE = "LGPL-2.1-or-later"

PV = "3.21.3"

RPM_NAME = "gtksourceviewmm3_0-devel-3.21.3-1.15.aarch64.rpm"
RPM_HASH = "f11e1c97db5c8f2ef61a3554d155f58d8abe7934f06f1b02abc76e0dfae07c6b7ad394b2c63484929559a8ee69461861ad4702eb436f5bb925b73b52ed5f8831"

RPROVIDES:${PN} += "gtksourceviewmm3_0-devel \
gtksourceviewmm3_0-devel(aarch-64) \
pkgconfig(gtksourceviewmm-3.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libgtksourceviewmm-3_0-0 \
pkgconfig(glibmm-2.4) \
pkgconfig(gtkmm-3.0) \
pkgconfig(gtksourceview-3.0)"

inherit rpm
