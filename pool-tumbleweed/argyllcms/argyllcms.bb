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

RPM_NAME = "argyllcms-2.3.1-2.6.aarch64.rpm"
RPM_HASH = "15fea9fab0be7a5ebccb6b4b8895fe2e688fbd505872a59d99dd1316166bdb09025063628fe50c6f9c7fe2751f3124c69be38d67a59bbb010a59cd8671aa3180"

RPROVIDES:${PN} += "argyllcms"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libXinerama.so.1 \
libXrandr.so.2 \
libXss.so.1 \
libXxf86vm.so.1 \
libc.so.6 \
libjpeg.so.8 \
libm.so.6 \
libpng16.so.16 \
libssl.so.3 \
libtiff.so.6 \
udev"

inherit rpm
