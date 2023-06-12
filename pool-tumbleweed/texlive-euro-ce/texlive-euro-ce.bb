SUMMARY = "Euro and CE sign font"
DESCRIPTION = "Metafont source for the symbols in several variants, designed \
to fit with the Computer Modern-set text."
LICENSE = "BSD-3-Clause"

PV = "2023.201.3.0bsvn25714"

RPM_NAME = "texlive-euro-ce-2023.201.3.0bsvn25714-52.1.noarch.rpm"
RPM_HASH = "6dac5b08b3bb680a4ded2336bf33d6b98f5f34b27f30fdfcfd4e1cc29e2e15ad3b789deff4b9d4b59fb406bf759590ba3128ecf2340682205e6c8bd447470881"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ceit.tfm) \
tex(cerm.tfm) \
tex(cesl.tfm) \
tex(eurobf.tfm) \
tex(eurobfit.tfm) \
tex(eurobfsl.tfm) \
tex(euroit.tfm) \
tex(euroof.tfm) \
tex(eurorm.tfm) \
tex(eurosl.tfm) \
tex(eurosp.tfm) \
texlive-euro-ce"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
