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
