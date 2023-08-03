SUMMARY = "Documentation macros"
DESCRIPTION = "The bundle provides macros that the author uses when writing \
documentation (for example, that of the texapi and yax \
packages). The tools could be used by anyone, but there is no \
documentation, and the macros are subject to change without \
notice."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn24731"

RPM_NAME = "texlive-pitex-2023.209.svn24731-52.1.noarch.rpm"
RPM_HASH = "bf373f8f894eb4c65a73630d7e970d1fd732c35de8067f3200498cdd2c3f126135256515bec5aec66c6e5d13031cbf000c729f69ee041eec737ef2e4b4990626"
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
