SUMMARY = "Perl interface to the libgd graphics library"
DESCRIPTION = "*GD.pm* is a Perl interface to Thomas Boutell's gd graphics library \
(version 2.01 or higher; see below). GD allows you to create color drawings \
using a large number of graphics primitives, and emit the drawings as PNG \
files."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "2.78"

RPM_NAME = "perl-GD-2.78-1.1.aarch64.rpm"
RPM_HASH = "78562daf8c1b1a5f3269b30b7651aacd223d2c7a12602446659d5ffc91c93c3217a196438bd283149d267aed8f3b7770d8af57f86818a1ebfe780df3c7e2f044"

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
