SUMMARY = "Noto Myanmar Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Myanmar Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-myanmar-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "a179d2b304bfd03280e494011b0145604853f8bbc915634f099d5978d1c72aa96492e75d024b50c7ab6c478351fa4b60d42d19622f35a99a09bb48f2ad71cfc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-myanmar \
noto-serif-myanmar-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
