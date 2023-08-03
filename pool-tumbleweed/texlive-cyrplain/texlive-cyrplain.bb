SUMMARY = "Support for using T2 encoding"
DESCRIPTION = "The T2 bundle provides a variety of separate support functions \
for using Cyrillic characters in LaTeX: the mathtext package, \
for using Cyrillic letters 'transparently' in formulae; the \
citehack package, for using Cyrillic (or indeed any non-ascii) \
characters in citation keys; support for Cyrillic in BibTeX; \
support for Cyrillic in Makeindex; and various items of font \
support."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45692"

RPM_NAME = "texlive-cyrplain-2023.209.svn45692-55.1.noarch.rpm"
RPM_HASH = "9699f7f98dd93d784908e5909b1e3c3557f30eb3361d3a430257654462d915a1832c4e85fef306853353296970b0a364521eaae1ac747e9eebad9b0cc09d09c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "config-texlive-cyrplain \
tex-cyrcmfnt.tex \
tex-cyrecfnt.tex \
tex-cyrtex.cfg \
tex-cyrtex.tex \
tex-plainenc.tex \
tex-txxdefs.tex \
tex-txxextra.tex \
texlive-cyrplain"

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
