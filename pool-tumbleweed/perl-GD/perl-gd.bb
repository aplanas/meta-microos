SUMMARY = "Perl interface to the gd2 graphics library"
DESCRIPTION = "*GD.pm* is a Perl interface to Thomas Boutell's gd graphics library \
(version 2.01 or higher; see below). GD allows you to create color drawings \
using a large number of graphics primitives, and emit the drawings as PNG \
files."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.76"

RPM_NAME = "perl-GD-2.76-2.1.aarch64.rpm"
RPM_HASH = "8078ab6c54a3df27de75d4a5a5d8e7cfddfca894cc27a1fc2dc47103d1e95efaeee8ca1908b0938142740cc3058c05f40e9215dd3c0815f81d65c2788d64f093"

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
perl--MODULE-COMPAT-5.36.0"

inherit rpm
