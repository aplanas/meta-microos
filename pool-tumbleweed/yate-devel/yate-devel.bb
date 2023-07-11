SUMMARY = "Development package for Yate"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use Yate."
LICENSE = "GPL-2.0-only"

PV = "6.4.0"

RPM_NAME = "yate-devel-6.4.0-4.10.aarch64.rpm"
RPM_HASH = "ee9218ad24de39fa81d98b0954565f077a12c6945571287e6d3e5530cdfa4afa738db20a6b3cf86d7f51dbc78047daea2f7c3fd66d64d2a6dfb8b53f684bc999"

RPROVIDES:${PN} += "pkgconfig-yate \
yate-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh \
libyate6-4-0"

inherit rpm
