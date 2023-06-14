SUMMARY = "Noto Traditional Nushu Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TraditionalNushu font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-traditionalnushu-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "ef186db3426dada965079b0146f7f4f899fccb58acf8b88351c35fa5df4a6c34201d2cbbe1a487dfdb0a33ba46b3cc8931471b9ec83209f9ae21f3d263dd7c3a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-traditionalnushu \
noto-traditionalnushu-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
