SUMMARY = "Euro and CE sign font"
DESCRIPTION = "Metafont source for the symbols in several variants, designed \
to fit with the Computer Modern-set text."
LICENSE = "BSD-3-Clause"

PV = "2023.209.3.0bsvn25714"

RPM_NAME = "texlive-euro-ce-2023.209.3.0bsvn25714-53.1.noarch.rpm"
RPM_HASH = "8e6fcf282de008dc96c7792011b46c1e338169c5572809d7d885fb30f408f4d44070697079ef017a35b65515c9e82501b3580b148f4a35a5302ac62c9881be5f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ceit.tfm \
tex-cerm.tfm \
tex-cesl.tfm \
tex-eurobf.tfm \
tex-eurobfit.tfm \
tex-eurobfsl.tfm \
tex-euroit.tfm \
tex-euroof.tfm \
tex-eurorm.tfm \
tex-eurosl.tfm \
tex-eurosp.tfm \
texlive-euro-ce"

RDEPENDS:${PN} += "/usr/bin/sh \
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
