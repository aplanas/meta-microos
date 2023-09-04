SUMMARY = "Helper functions for op tree manipulation"
DESCRIPTION = "Helper functions for op tree manipulation"
LICENSE = "Artistic-1.0 | GPL-1.0+"

PV = "0.27"

RPM_NAME = "perl-B-Utils-0.27-1.38.aarch64.rpm"
RPM_HASH = "43c8c2d12d203355de93d4e5ccbef744670e236177f1848c3c594eea8b7f5b3708572c2cd35deefd6a785fdc7ff0dee84cbd60e496da5707a4c1d11a8a8e7c9c"

RPROVIDES:${PN} += "perl-B--Utils \
perl-B--Utils--Install--Files \
perl-B--Utils--OP \
perl-B-Utils"

RDEPENDS:${PN} += "libc.so.6 \
perl--MODULE-COMPAT-5.38.0 \
perl-Task--Weaken"

inherit rpm
