SUMMARY = "Documentation macros"
DESCRIPTION = "The bundle provides macros that the author uses when writing \
documentation (for example, that of the texapi and yax \
packages). The tools could be used by anyone, but there is no \
documentation, and the macros are subject to change without \
notice."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn24731"

RPM_NAME = "texlive-pitex-2023.201.svn24731-51.1.noarch.rpm"
RPM_HASH = "13ad65b386206795f37cbb26b987045712402ea3190ae363c241603495f56f2184cf24a1a05cd16ab8cf44865b4e3a65469f2d08cf8aa16399adea5fc81decf9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pitex.tex \
texlive-pitex"

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
