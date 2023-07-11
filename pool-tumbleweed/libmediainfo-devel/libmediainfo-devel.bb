SUMMARY = "Header files for libmediainfo"
DESCRIPTION = "MediaInfo supplies technical and tag information about a video or \
audio file. \
 \
This subpackage contains the C API header definitions."
LICENSE = "BSD-2-Clause"

PV = "23.06"

RPM_NAME = "libmediainfo-devel-23.06-1.1.aarch64.rpm"
RPM_HASH = "68413674fc390d829ed02ca0c7aabe6d792ff7754cbe7c17637296de08ede80669b1f07da54def6139bca83f28190592e4692523562ec55453b60cd756b47d20"

RPROVIDES:${PN} += "libmediainfo-devel \
pkgconfig-libmediainfo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libmediainfo0 \
pkgconfig-libcurl \
pkgconfig-libzen"

inherit rpm
