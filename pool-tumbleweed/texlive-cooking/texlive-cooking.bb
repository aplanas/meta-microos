SUMMARY = "Typeset recipes"
DESCRIPTION = "The package typesets recipes according to the style used in a \
well-respected German cookery book."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.9bsvn15878"

RPM_NAME = "texlive-cooking-2023.209.0.0.9bsvn15878-55.1.noarch.rpm"
RPM_HASH = "c98eec37777d9cb1fe5a1cca90a45f73749104a59835ba04972d3eb7968d6babcc2eb8ef8f2ee669d9e417df698a7557aeecb3930a54eeadacd343295ecece3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cooking.sty \
texlive-cooking"

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
