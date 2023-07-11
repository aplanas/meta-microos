SUMMARY = "Development files for the Exempi XMP support library"
DESCRIPTION = "Exempi is a library for XMP metadata parsing and doing I/O with it. \
 \
This subpackage contains the header files for building applications \
with Exempi."
LICENSE = "BSD-3-Clause"

PV = "2.6.3"

RPM_NAME = "libexempi-devel-2.6.3-1.4.aarch64.rpm"
RPM_HASH = "060f02198bab6fc0dbce1d2ced545b6617f24a01ef4d75173946114c4fc22012a0778037b3e99dc5aa45e079be082b0beb914701c4dab52eec76ee9b6986f64b"

RPROVIDES:${PN} += "libexempi-devel \
pkgconfig-exempi-2.0"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libexempi8"

inherit rpm
