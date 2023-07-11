SUMMARY = "A 'lipsum' for Persian"
DESCRIPTION = "The package provides lipsum-like facilities for the Persian \
language. The source of the filling text is the Persian epic \
'the Shanameh' (100 paragraphs are used.) The package needs to \
be run under XeLaTeX."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn30171"

RPM_NAME = "texlive-ptext-2023.201.1.1svn30171-53.2.noarch.rpm"
RPM_HASH = "1b258e54e4f227ba712aad1361df3548483cd5cecc6b6d0868d5d6f2f098126fd579794c215543c50cb7817486a810e0b2ce7a47e4146aab0bd6ccff7248c650"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ptext.sty \
texlive-ptext"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-biditools.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
