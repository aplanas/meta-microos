SUMMARY = "Plain TeX format for pTeX and e-pTeX"
DESCRIPTION = "The bundle contains the plain TeX format for pTeX and e-pTeX."
LICENSE = "BSD-3-Clause"

PV = "2023.209.svn64072"

RPM_NAME = "texlive-ptex-base-2023.209.svn64072-54.2.noarch.rpm"
RPM_HASH = "a65b329176651477ed1122e887c10662da5c11306425b9e812124849daffb9401674049fab07745934c7fab6f8bb0e2f1f8e43a1fbe95d70bbf91ed9bbaac7bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-ascii-jplain.tex \
tex-kinsoku.tex \
tex-ptex.tex \
texlive-ptex-base"

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
