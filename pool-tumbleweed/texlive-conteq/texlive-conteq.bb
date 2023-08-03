SUMMARY = "Typeset multiline continued equalities"
DESCRIPTION = "The package provides an environment conteq, which will lay out \
systems of continued equalities (or inequalities). Several \
variant layouts of the equalities are provided, and the user \
may define their own. The package is written using LaTeX 3 \
macros."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.1svn37868"

RPM_NAME = "texlive-conteq-2023.209.0.0.1.1svn37868-55.1.noarch.rpm"
RPM_HASH = "e33a3868e05f06821d7454ffc4005c69e485f0357f1dbfd08a1f33bc40433a59b30adc8a1d022bd34f76fd647f994b1699d409d17181b4aeee852ad14c75e923"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-conteq.sty \
texlive-conteq"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-amsmath.sty \
tex-environ.sty \
tex-expl3.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
