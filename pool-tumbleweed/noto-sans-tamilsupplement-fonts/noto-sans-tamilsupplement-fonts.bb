SUMMARY = "Noto Tamil Supplement Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
TamilSupplement Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-tamilsupplement-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "61d02de3becbdfd139d8cbbc07815b5661bd80a54ba73a93d1f3c7c807f302079a7b266b3d5daa483a8abd0d8736ca95470e99a9e43280a4d6c43a09723c175c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-tamilsupplement \
noto-sans-tamilsupplement-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
