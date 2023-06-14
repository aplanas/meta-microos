SUMMARY = "Polygon clipping in 2D"
DESCRIPTION = "'Clipper' is a C++ (and Delphi) library that implements polygon clipping."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.29"

RPM_NAME = "perl-Math-Clipper-1.29-1.23.aarch64.rpm"
RPM_HASH = "e86e2d9c1c00f3b0150c2ffeb488b5856efc2b4c84d2bad639cedc22b27b3027a92a4a5d416e438115804aac6e60ca6638b293ccaa58962ee94fac6d6de5621c"

RPROVIDES:${PN} += "perl-Math--Clipper \
perl-Math-Clipper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
perl--MODULE-COMPAT-5.36.0"

inherit rpm
