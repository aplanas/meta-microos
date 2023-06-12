SUMMARY = "ICC compatible color management system"
DESCRIPTION = "The Argyll color management system supports accurate ICC profile creation for \
scanners, CMYK printers, film recorders and calibration and profiling of \
displays. \
 \
Spectral sample data is supported, allowing a selection of illuminants observer \
types, and paper fluorescent whitener additive compensation. Profiles can also \
incorporate source specific gamut mappings for perceptual and saturation \
intents. Gamut mapping and profile linking uses the CIECAM02 appearance model, \
a unique gamut mapping algorithm, and a wide selection of rendering intents. It \
also includes code for the fastest portable 8 bit raster color conversion \
engine available anywhere, as well as support for fast, fully accurate 16 bit \
conversion. Device color gamuts can also be viewed and compared using a VRML \
viewer."
LICENSE = "AGPL-3.0-only & GPL-2.0-or-later & MIT"

PV = "2.3.1"

RPM_NAME = "argyllcms-2.3.1-2.5.aarch64.rpm"
RPM_HASH = "4aa2d1a0ec396596dcdb2032d3e00656987b4cd67c8b213dd33b831dc6fe35265a734d2898fed0b7bcf0a663e56481621adbaa095c427aa2316ff77429195bb5"

RPROVIDES:${PN} += "argyllcms \
argyllcms(aarch-64)"
RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXext.so.6()(64bit) \
libXinerama.so.1()(64bit) \
libXrandr.so.2()(64bit) \
libXss.so.1()(64bit) \
libXxf86vm.so.1()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libssl.so.3()(64bit) \
libssl.so.3(OPENSSL_3.0.0)(64bit) \
libtiff.so.6()(64bit) \
libtiff.so.6(LIBTIFF_4.0)(64bit) \
udev"

inherit rpm
