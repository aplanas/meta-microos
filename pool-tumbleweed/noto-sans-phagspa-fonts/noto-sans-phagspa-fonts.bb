SUMMARY = "Noto Phags Pa Sans Serif Font"
DESCRIPTION = "Noto's design goal is to achieve visual harmonization (e.g., compatible \
heights and stroke thicknesses) across languages. This package contains \
PhagsPa Sans Serif font, hinted."
LICENSE = "OFL-1.1"

PV = "20220607"

RPM_NAME = "noto-sans-phagspa-fonts-20220607-2.6.noarch.rpm"
RPM_HASH = "0be11c94863dbcf60585685becba789954e8935bae8c5567834d5ce87df767dd7485418a2f728a155aa210c13d135c18310a6192b35d01362810bfe8ef101db7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "noto-sans-phagspa \
noto-sans-phagspa-fonts"
RDEPENDS:${PN} += "/bin/sh \
aaa_base \
coreutils \
perl"

inherit rpm
