SUMMARY = "Development files for librttopo"
DESCRIPTION = "This package contains all necessary include files and libraries needed \
to compile and develop applications that use librttopo."
LICENSE = "GPL-2.0-or-later"

PV = "1.1.0"

RPM_NAME = "librttopo-devel-1.1.0-2.4.aarch64.rpm"
RPM_HASH = "169d13ef49be35a7cc76f95b4dc7169674c9c28ce93514e4e95802ffecf454502ba2d3a103633eb871123780afa3743c03e45264c9b61dc62f208524a6c85e79"

RPROVIDES:${PN} += "librttopo-devel \
librttopo-devel(aarch-64) \
pkgconfig(rttopo)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
librttopo1"

inherit rpm
