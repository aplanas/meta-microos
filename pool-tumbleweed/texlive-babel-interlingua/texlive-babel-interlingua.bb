SUMMARY = "Babel support for Interlingua"
DESCRIPTION = "The package provides the language definition file for support \
of Interlingua in babel. Translations to Interlingua of \
standard 'LaTeX names' (no shortcuts are provided). Interlingua \
itself is an auxiliary language, built from the common \
vocabulary of Spanish/Portuguese, English, Italian and French, \
with some normalisation of spelling."
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn30276"

RPM_NAME = "texlive-babel-interlingua-2023.201.1.6svn30276-53.1.noarch.rpm"
RPM_HASH = "75b7b5f69aa7f80cef73a4d30d2690ea64f3b6472225cde29abab783703002e7ed06178e0ff7d7e0b5d9fd4b1004658496178efd875f20dcad097e2cdb9e4d40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-interlingua.ldf \
texlive-babel-interlingua"

RDEPENDS:${PN} += "/bin/sh \
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
