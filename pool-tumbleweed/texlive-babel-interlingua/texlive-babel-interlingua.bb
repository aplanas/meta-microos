SUMMARY = "Babel support for Interlingua"
DESCRIPTION = "The package provides the language definition file for support \
of Interlingua in babel. Translations to Interlingua of \
standard 'LaTeX names' (no shortcuts are provided). Interlingua \
itself is an auxiliary language, built from the common \
vocabulary of Spanish/Portuguese, English, Italian and French, \
with some normalisation of spelling."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn30276"

RPM_NAME = "texlive-babel-interlingua-2023.209.1.6svn30276-54.1.noarch.rpm"
RPM_HASH = "521eafa472d54228eb849b10faca67ded9f095dac02c91cf626ec59e5022eddf8001b2905004f066aa7afc545bd166b6c45b8c6bcaa9277f9e7d02d93e5b3653"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-interlingua.ldf \
texlive-babel-interlingua"

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
