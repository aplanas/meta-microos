SUMMARY = "Development files for the Osmocom transcoding library"
DESCRIPTION = "libosmocoding is a library which provides GSM, GPRS and EDGE \
transcoding routines. \
 \
This subpackage contains libraries and header files for developing \
applications that want to make use of libosmocoding."
LICENSE = "GPL-2.0-or-later"

PV = "1.8.0"

RPM_NAME = "libosmocoding-devel-1.8.0-1.2.aarch64.rpm"
RPM_HASH = "25e4ffa3f3d0f8dce8647048c7eeed241911d5fa6c1c1c95d02251b805f0b18f079fcfa0623563ceb3dcb7ddcf69b741698a46fd289ebdb732e6d7cff532edd7"

RPROVIDES:${PN} += "libosmocoding-devel \
pkgconfig-libosmocoding"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libosmocoding0 \
libosmocore-devel \
pkgconfig-libosmocodec \
pkgconfig-libosmocore \
pkgconfig-libosmogsm \
pkgconfig-talloc"

inherit rpm
