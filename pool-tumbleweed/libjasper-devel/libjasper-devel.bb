SUMMARY = "Development files for libjasper, a JPEG-2000 library"
DESCRIPTION = "This package contains libjasper, a library implementing the JPEG-2000 \
image compression standard Part 1."
LICENSE = "JasPer-2.0"

PV = "4.0.0"

RPM_NAME = "libjasper-devel-4.0.0-1.4.aarch64.rpm"
RPM_HASH = "d313bdd7d7db6d2196930175929756547fde0bde9eacc9925025bd72ddba3a002ec8ab5f752dcc7355e1367531557d5ae5994001d6408f992235e23a363eb0be"

RPROVIDES:${PN} += "libjasper-devel \
pkgconfig-jasper"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjasper7 \
libjpeg-devel \
pkgconfig-libjpeg"

inherit rpm
