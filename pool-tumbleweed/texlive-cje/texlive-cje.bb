SUMMARY = "LaTeX document class for CJE articles"
DESCRIPTION = "The cje article class allows authors to format their papers to \
Canadian Journal of Economics style with minimum effort. The \
class includes options for two other formats: 'review' (double \
spaced, for use at the submission stage) and 'proof' (used by \
the typesetters to prepare the proof authors will receive for \
approval)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.06svn46721"

RPM_NAME = "texlive-cje-2023.209.1.06svn46721-54.1.noarch.rpm"
RPM_HASH = "65fc8abed023f2ffc0f4cb528f264064b60a8acf8cbad122378caa4a543f67fbc3fcd50850aa58518c7f991b198e0159ffc35795ffa913dc4e4e19a531f6ce0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-cje.cls \
tex-cjenatbib.sty \
tex-cjeupmath.sty \
texlive-cje"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsbsy.sty \
tex-amssymb.sty \
tex-lineno.sty \
tex-natbib.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
