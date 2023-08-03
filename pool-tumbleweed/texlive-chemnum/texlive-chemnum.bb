SUMMARY = "A method for numbering chemical compounds"
DESCRIPTION = "The package defines a \\label- and \\ref-like commands for \
compound numbers. The package requires LaTeX3 packages expl3 \
(from the l3kernel bundle) as well as xparse and l3keys2e (from \
the l3packages bundle)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3asvn57490"

RPM_NAME = "texlive-chemnum-2023.209.1.3asvn57490-54.1.noarch.rpm"
RPM_HASH = "04a8e700eee34dc05886bee8f0b1cc1cc30f8d232786f4ef33a5742ccc1fe1542868be1dea8996b7f233537db9702f29c115f6990d4661109e43fc56afd83ee8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-chemnum.sty \
texlive-chemnum"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-chemgreek.sty \
tex-expl3.sty \
tex-l3keys2e.sty \
tex-psfrag.sty \
tex-translations.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
