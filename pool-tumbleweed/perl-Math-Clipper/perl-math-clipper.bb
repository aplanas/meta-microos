SUMMARY = "Polygon clipping in 2D"
DESCRIPTION = "'Clipper' is a C++ (and Delphi) library that implements polygon clipping."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.29"

RPM_NAME = "perl-Math-Clipper-1.29-1.24.aarch64.rpm"
RPM_HASH = "edec8e729a248605fa23bb3dcc77a375ec04e815553dfd4942064b4cae22194ddd2b35b21a8767f467b0c683fd54f59258316f659bd480709d41a34face5bd0f"

RPROVIDES:${PN} += "perl-Math--Clipper \
perl-Math-Clipper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
perl--MODULE-COMPAT-5.36.1"

inherit rpm
