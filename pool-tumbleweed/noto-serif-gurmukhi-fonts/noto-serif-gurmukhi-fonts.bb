SUMMARY = "Noto Gurmukhi Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Gurmukhi Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-gurmukhi-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "2eed2dd22ead071117f5227974f286fe20754b5b78b576f98adb21afbadc712487a2d5a852177ce5036b8a903a3c8729f568c45219ab42320cf89a86a3d5d6a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-gurmukhi \
noto-serif-gurmukhi-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
