SUMMARY = "Noto Imperial Aramaic Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
ImperialAramaic Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-imperialaramaic-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "18ac413bd0628ae134dc7e20f872cb6b1646fe09c3f95f5f323cfa5f9292dda23a814a8912ade8670e8010c8a5d499a80d124a3b651784fa41ee674a5edf8c73"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-imperialaramaic \
noto-sans-imperialaramaic-fonts"

RDEPENDS:${PN} += "/bin/sh \
aaa-base \
coreutils \
perl"

inherit rpm
