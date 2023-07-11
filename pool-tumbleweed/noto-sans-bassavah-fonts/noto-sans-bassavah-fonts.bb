SUMMARY = "Noto Bassa Vah Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
BassaVah Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-bassavah-fonts-20220607-2.7.noarch.rpm"
RPM_HASH = "b4f9d5fef5d34d91adcaeb1b7893413e8e7c52522061788f6b1c9003fa31cda4f2adc1e29d46b1fdc1f38bb17d7ee86a78ba66a7a0461fa12ea8098e41978565"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-bassavah \
noto-sans-bassavah-fonts"

RDEPENDS:${PN} += "/usr/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
