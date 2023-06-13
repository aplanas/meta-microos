SUMMARY = "Indices locorum citatorum"
DESCRIPTION = "The package is designed to produce from BibTeX or BibLaTeX \
bibliographical databases the different indices of authors and \
works cited which are called indices locorum citatorum. It \
relies on a specific \\icite command and can operate with either \
BibTeX or BibLaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3asvn54512"

RPM_NAME = "texlive-icite-2023.201.1.3asvn54512-52.1.noarch.rpm"
RPM_HASH = "52cf1ecf356d372245247caaa85e32f6226fd12dd08e3b3d6fb620cc431d9394a6482ee09402fcacc52843c0e682e084c89b53e48246b9b8ef4b17056c90f657"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(icite.sty) \
texlive-icite"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(datatool.sty) \
tex(usebib.sty) \
tex(xkeyval.sty) \
tex(xparse.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
