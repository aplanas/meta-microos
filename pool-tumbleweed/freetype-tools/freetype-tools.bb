SUMMARY = "Bundled Tests, Demos and Tools for FreeType  (Needed for CJK-LaTeX)"
DESCRIPTION = "Bundled tests, demos and tools for FreeType. Needed for CJK-LaTeX. \
 \
The FreeType engine is a free and portable TrueType font rendering \
engine. It has been developed to provide TT support to a great variety \
of platforms and environments. \
 \
This package contains several programs bundled with the FreeType engine \
for testing and demonstration purposes as well as some contributed \
utilities, such as ttf2bdf, ttf2pfb, and ttfbanner."
LICENSE = "SUSE-Freetype | GPL-2.0-or-later"

PV = "1.3.1"

RPM_NAME = "freetype-tools-1.3.1-1419.13.aarch64.rpm"
RPM_HASH = "a21c38c1ace172f537d4e0e15ead237a7428b2a5282cbbeb89194b5b428405059d8ddd75078d9362720f556aed1e5e7c5e17ebb5c01845df1bef7a6db014e4a0"

RPROVIDES:${PN} += "freetype-tools"

RDEPENDS:${PN} += "/usr/bin/sh \
freetype \
ld-linux-aarch64.so.1 \
libc.so.6 \
libttf.so.2"

inherit rpm
