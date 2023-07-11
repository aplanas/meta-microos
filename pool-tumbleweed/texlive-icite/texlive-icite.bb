SUMMARY = "Indices locorum citatorum"
DESCRIPTION = "The package is designed to produce from BibTeX or BibLaTeX \
bibliographical databases the different indices of authors and \
works cited which are called indices locorum citatorum. It \
relies on a specific \\icite command and can operate with either \
BibTeX or BibLaTeX."
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.1.3asvn54512"

RPM_NAME = "texlive-icite-2023.208.1.3asvn54512-53.1.noarch.rpm"
RPM_HASH = "b28809e38c907dc6c6177420c02880724c87c35ae897ca515a00212b6317729a31158df9bc59f3d4eb778b300321e6920e46e914c0af1225acdea7001b5ecf51"
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
