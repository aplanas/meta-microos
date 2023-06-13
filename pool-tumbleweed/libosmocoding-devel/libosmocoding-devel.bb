SUMMARY = "Development files for the Osmocom transcoding library"
DESCRIPTION = "libosmocoding is a library which provides GSM, GPRS and EDGE \
transcoding routines. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmocoding."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmocoding-devel-1.8.0-1.1.aarch64.rpm"
RPM_HASH = "b6adac80c83f6b76de63609e8e9de389ffec0224c5dfe23a3a52c07ec45d6fc79580accff9b45bc4051fa211750c7edd665230dcdfea1f12b271d6006f350d31"

RPROVIDES:${PN} += "libosmocoding-devel \
libosmocoding-devel(aarch-64) \
pkgconfig(libosmocoding)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmocoding0 \
libosmocore-devel \
pkgconfig(libosmocodec) \
pkgconfig(libosmocore) \
pkgconfig(libosmogsm) \
pkgconfig(talloc)"

inherit rpm
