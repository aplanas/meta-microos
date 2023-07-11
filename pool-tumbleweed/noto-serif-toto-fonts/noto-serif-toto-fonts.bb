SUMMARY = "Noto Toto Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
Toto Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-serif-toto-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "17bae10fbe3eec2cef2d7369a32572d9d7cde55047a5cd583bcc7704eb353ad1b0b96ee3fe6eff5cd0b92883767bba24603bdfe5197c6d01d819ca9eb3f920ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-serif-toto \
noto-serif-toto-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
