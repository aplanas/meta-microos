SUMMARY = "Header files for libmediainfo"
DESCRIPTION = "MediaInfo supplies technical and tag information about a video or \
audio file. \
 \
This subpackage contains the C API header definitions."
LICENSE = "BSD-2-Clause"

PV = "23.04"

RPM_NAME = "libmediainfo-devel-23.04-1.1.aarch64.rpm"
RPM_HASH = "982c1ebdeaa4e0970ad2ec2561873810bc9546be41827e9c9dce5d56b730eefdf9017e204dab0c1f4c5e523d7acbabe6537126405df0c9e44455e5f1907196d2"

RPROVIDES:${PN} += "libmediainfo-devel \
libmediainfo-devel(aarch-64) \
pkgconfig(libmediainfo)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmediainfo0 \
pkgconfig(libcurl) \
pkgconfig(libzen)"

inherit rpm
