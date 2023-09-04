SUMMARY = "Indices locorum citatorum"
DESCRIPTION = "The package is designed to produce from BibTeX or BibLaTeX \
bibliographical databases the different indices of authors and \
works cited which are called indices locorum citatorum. It \
relies on a specific \\icite command and can operate with either \
BibTeX or BibLaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3asvn54512"

RPM_NAME = "texlive-icite-2023.209.1.3asvn54512-54.1.noarch.rpm"
RPM_HASH = "7990fce5babf11f8c9e2b5e3957843eab8180fef014bb03338eb0e6a770590dd5ddb9513b1c6e6ee4d9b759c32b5a4f4b1a55a73687e4898996ab4f740f9d54c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-icite.sty \
texlive-icite"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-datatool.sty \
tex-usebib.sty \
tex-xkeyval.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
