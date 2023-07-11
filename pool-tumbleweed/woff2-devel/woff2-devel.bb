SUMMARY = "Development files for woff2"
DESCRIPTION = "Web Open Font Format (WOFF) 2.0 is an update to the existing WOFF \
1.0 with improved compression that is achieved by using the Brotli \
algorithm. The primary purpose of the WOFF2 format is to \
efficiently package fonts linked to Web documents by means of CSS \
@font-face rules. \
 \
This package contains development files for woff2."
LICENSE = "MIT"

PV = "1.0.2"

RPM_NAME = "woff2-devel-1.0.2-4.4.aarch64.rpm"
RPM_HASH = "11e044000a23bb72451c7c29d336510281c8701107c2a1bafdb5390863836eae7a8f7ca93308f4899f24210dcfa870f1ebef3bfebe54c694f4f5c824c66d40b7"

RPROVIDES:${PN} += "pkgconfig-libwoff2common \
pkgconfig-libwoff2dec \
pkgconfig-libwoff2enc \
woff2-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwoff2common1-0-2 \
libwoff2dec1-0-2 \
libwoff2enc1-0-2 \
pkgconfig-libbrotlidec \
pkgconfig-libbrotlienc \
pkgconfig-libwoff2common"

inherit rpm
