SUMMARY = "Spelling cardinal and ordinal numbers"
DESCRIPTION = "This package supports the spelling of cardinal and ordinal \
numbers. Supported languages are English, French, German, \
Hungarian, Italian, and Latin. The package requires xstring and \
iflang."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.5svn61132"

RPM_NAME = "texlive-numspell-2023.209.1.5svn61132-55.1.noarch.rpm"
RPM_HASH = "965373072e15649ea5293cb88ed3a61518853edb5923e1b5317ea412a78ce992ed6c5abebde7e0c132497d711d936272f5572e915624137f27fb2cdb3c58232f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-numspell-english.sty \
tex-numspell-french.sty \
tex-numspell-german.sty \
tex-numspell-italian.sty \
tex-numspell-latin.sty \
tex-numspell-magyar.sty \
tex-numspell.sty \
texlive-numspell"

RDEPENDS:${PN} += "/usr/bin/sh \
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
