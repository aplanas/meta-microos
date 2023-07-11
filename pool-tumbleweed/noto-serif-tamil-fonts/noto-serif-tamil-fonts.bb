SUMMARY = "Noto Tamil Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Tamil Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-tamil-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "07050af14f7daab2c495c720a7d6b63e03480544ef06a6f2d013ba3d36d73e003b6c78591ee4ecb490456c6a6456f7b9145de08e17797a02da1d80f43e88e3c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-tamil \
noto-serif-tamil-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
