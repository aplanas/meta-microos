SUMMARY = "Tibetan for TeX and LaTeX2e"
DESCRIPTION = "A package using a modified version of Sirlin's Tibetan font. An \
advantage of this Tibetan implementation is that all consonant \
clusters are formed by TeX and Metafont. No external \
preprocessor is needed."
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn15878"

RPM_NAME = "texlive-ctib-2023.204.svn15878-54.1.noarch.rpm"
RPM_HASH = "2a8a4d0aa7aacd7982322401be99025fcb8dcbef8aaa121af572d49cbad1e57a7b1b8451e4428073c969bde8bcdcfc5c052691533271b95758a6f320070dd422"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex(ctib.sty) \
tex(ctib.tex) \
tex(ctib.tfm) \
tex(lctctib.fd) \
tex(lctenc.def) \
texlive-ctib"
RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex(fontenc.sty) \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
