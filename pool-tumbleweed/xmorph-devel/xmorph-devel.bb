SUMMARY = "Development Files For Xmorph"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to develop applications that require these."
LICENSE = "GPL-2.0-or-later"

PV = "20060817"

RPM_NAME = "xmorph-devel-20060817-250.10.aarch64.rpm"
RPM_HASH = "bbae02a13a485b318bfd3fd3de2778af2702811603d323b0acb7b2da1ad8922fb7a2984c1379d929216259e8d790fd3205a5affa8af985ddcad59ae37a716f83"

RPROVIDES:${PN} += "xmorph-devel"

RDEPENDS:${PN} += "glibc-devel \
xmorph"

inherit rpm
