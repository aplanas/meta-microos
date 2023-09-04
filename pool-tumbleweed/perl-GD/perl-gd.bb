SUMMARY = "Perl interface to the libgd graphics library"
DESCRIPTION = "*GD.pm* is a Perl interface to Thomas Boutell's gd graphics library \
(version 2.01 or higher; see below). GD allows you to create color drawings \
using a large number of graphics primitives, and emit the drawings as PNG \
files."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.78"

RPM_NAME = "perl-GD-2.78-1.2.aarch64.rpm"
RPM_HASH = "4c659a2314951cad1f6058a1871f04ad01dc3f7f83061d63b64d871cd29001b2c78f745473aa8b646fc4b6e60c7548b53aed9edbeb87721357b3338fdc93cff0"

RPROVIDES:${PN} += "perl-GD \
perl-GD--Group \
perl-GD--Image \
perl-GD--Polygon \
perl-GD--Polyline \
perl-GD--Simple"

RDEPENDS:${PN} += "/usr/bin/perl \
gd \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgd.so.3 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
