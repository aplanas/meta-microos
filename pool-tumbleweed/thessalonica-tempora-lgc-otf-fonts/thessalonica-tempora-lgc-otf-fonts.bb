SUMMARY = "Tempora LGC Unicode Fonts (OpenType Format)"
DESCRIPTION = "Tempora LGC Unicode is a font family, designed to provide a free \
typeface suitable for word processing in languages which use 3 European \
alphabets: Latin, Greek and Cyrillic. It may be especially useful for \
philologists (mainly slavists and classicists), since it supports \
historical Cyrillic letters available in the Unicode standard (including \
letters used in Russian  pre-1918 orthography) as well as all accented \
combinations and additional characters needed for fully accented Greek \
(both classical and modern). Tempora LGC Unicode is a 'smart' font, \
intended to demonstrate nicities of the OpenType technologie, applicable \
to European scripts. \
 \
This package contains fonts in OpenType format."
LICENSE = "GPL-2.0-with-font-exception"

PV = "0.2.1"

RPM_NAME = "thessalonica-tempora-lgc-otf-fonts-0.2.1-11.18.noarch.rpm"
RPM_HASH = "81ae1d4d53fcbd6dcde3eefae44c9ad1cf2cf395b8c56cb7ca71e7bef9734d6d2d73b8a8908068028d994cd829728a1087422777f3a319b1e52a340cd1ee780c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tempora-lgc-fonts-otf \
thessalonica-tempora-lgc-otf-fonts"

RDEPENDS:${PN} += "/usr/bin/sh"

inherit rpm
