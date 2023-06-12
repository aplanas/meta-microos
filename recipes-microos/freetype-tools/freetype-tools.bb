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

RPM_NAME = "freetype-tools-1.3.1-1419.12.aarch64.rpm"
RPM_HASH = "60ac0cab3e5b088a057ca90535293af0bba71112ca792ff86183a443b68c8ca1cc846d042cbdf8dacd12aa6beb5ddef83b1994067867a9f79239c98d99a6701f"

RPROVIDES:${PN} += "freetype-tools \
freetype-tools(aarch-64)"
RDEPENDS:${PN} += "/bin/sh \
freetype \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libttf.so.2()(64bit)"

inherit rpm
