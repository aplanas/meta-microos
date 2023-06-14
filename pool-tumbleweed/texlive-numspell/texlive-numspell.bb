SUMMARY = "Spelling cardinal and ordinal numbers"
DESCRIPTION = "This package supports the spelling of cardinal and ordinal \
numbers. Supported languages are English, French, German, \
Hungarian, Italian, and Latin. The package requires xstring and \
iflang."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn61132"

RPM_NAME = "texlive-numspell-2023.201.1.5svn61132-54.1.noarch.rpm"
RPM_HASH = "dd22e3b7350ae16849134b83c298320b0e4983e90fc375078c3d38113a7a76bac78a324ba7cc4add083fa090ea0cb6dcc185496602857995d0e01da0287c77e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-numspell-english.sty \
tex-numspell-french.sty \
tex-numspell-german.sty \
tex-numspell-italian.sty \
tex-numspell-latin.sty \
tex-numspell-magyar.sty \
tex-numspell.sty \
texlive-numspell"

RDEPENDS:${PN} += "/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iflang.sty \
tex-xstring.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
