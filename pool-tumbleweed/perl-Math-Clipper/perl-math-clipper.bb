SUMMARY = "Polygon clipping in 2D"
DESCRIPTION = "'Clipper' is a C++ (and Delphi) library that implements polygon clipping."
LICENSE = "Artistic-1.0 | GPL-1.0-or-later"

PV = "1.29"

RPM_NAME = "perl-Math-Clipper-1.29-1.25.aarch64.rpm"
RPM_HASH = "86bd17304a9de662f7b6327f078de04b1cf97db4a3439e10cbf37378ad569b23bf3540aedbc13cf9e3590a496028b16945d78284688a9a52de3a2cefe00bd28c"

RPROVIDES:${PN} += "perl-Math--Clipper \
perl-Math-Clipper"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6 \
perl--MODULE-COMPAT-5.38.0"

inherit rpm
