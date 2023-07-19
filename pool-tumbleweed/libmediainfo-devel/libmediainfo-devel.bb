SUMMARY = "Header files for libmediainfo"
DESCRIPTION = "MediaInfo supplies technical and tag information about a video or \
audio file. \
 \
This subpackage contains the C API header definitions."
LICENSE = "BSD-2-Clause"

PV = "23.07"

RPM_NAME = "libmediainfo-devel-23.07-1.1.aarch64.rpm"
RPM_HASH = "7231a6f722c8baf02145b05783ed9886ba05109dba46a201843fdda24ef243fbe91d2caa89abb11d1541c6b940f692773107fe462d80ca275d13db97d4c686ab"

RPROVIDES:${PN} += "libmediainfo-devel \
pkgconfig-libmediainfo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmediainfo0 \
pkgconfig-libcurl \
pkgconfig-libzen"

inherit rpm
