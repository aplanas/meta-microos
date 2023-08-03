SUMMARY = "A Class for Typesetting Brazilian legal texts"
DESCRIPTION = "This class implements rules to typeset Brazilian legal texts. \
Its purpose is to be an easy-to-use implementation for the \
end-user."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn44939"

RPM_NAME = "texlive-br-lex-2023.209.svn44939-53.1.noarch.rpm"
RPM_HASH = "127a56c95c788f95dc639a0579dd18137bc880e4abf125a2ed348e4cea760ec683d128324c4fc97323ed50e7fcd312132a3e17ebb441a1aa0d8c48a30d8d256a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-br-lex.cls \
texlive-br-lex"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-babel.sty \
tex-fontspec.sty \
tex-ifxetex.sty \
tex-inputenc.sty \
tex-polyglossia.sty \
tex-textcase.sty \
tex-ulem.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
