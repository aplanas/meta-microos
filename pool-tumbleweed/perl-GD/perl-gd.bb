SUMMARY = "Perl interface to the gd2 graphics library"
DESCRIPTION = "*GD.pm* is a Perl interface to Thomas Boutell's gd graphics library \
(version 2.01 or higher; see below). GD allows you to create color drawings \
using a large number of graphics primitives, and emit the drawings as PNG \
files."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.76"

RPM_NAME = "perl-GD-2.76-2.2.aarch64.rpm"
RPM_HASH = "efac72c5036848ce0454664ff1b9682940344caea966c4e1b025d420d54cf04d4d79f8820147aa34836f3961465a846b7a931087bd01998c210db7c3e9c611f4"

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
perl--MODULE-COMPAT-5.36.1"

inherit rpm
