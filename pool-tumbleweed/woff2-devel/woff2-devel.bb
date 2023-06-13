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

RPM_NAME = "woff2-devel-1.0.2-4.3.aarch64.rpm"
RPM_HASH = "d28af735dc22d6133c068e09b258472bc07ef5d7a60ce9fdfa0da2c6bcddbc02f6f6f601ef3c5f5627bad6adb64722f03bd2d3ad4d71b17d96895278c6baff86"

RPROVIDES:${PN} += "pkgconfig(libwoff2common) \
pkgconfig(libwoff2dec) \
pkgconfig(libwoff2enc) \
woff2-devel \
woff2-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libwoff2common1_0_2 \
libwoff2dec1_0_2 \
libwoff2enc1_0_2 \
pkgconfig(libbrotlidec) \
pkgconfig(libbrotlienc) \
pkgconfig(libwoff2common)"

inherit rpm
