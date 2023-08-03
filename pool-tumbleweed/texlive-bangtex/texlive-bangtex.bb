SUMMARY = "Writing Bangla and Assamese with LaTeX"
DESCRIPTION = "The bundle provides class files for writing Bangla and Assamese \
with LaTeX, and Metafont sources for fonts."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn55475"

RPM_NAME = "texlive-bangtex-2023.209.svn55475-54.1.noarch.rpm"
RPM_HASH = "4be7ad3fb768d52ee0b84ea9ad037cfc1300ba7044507c0c3938c48058e7149176505de5684690a3d83428416804f42b8987b098b518a0e480291ee0d0f58748"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bang10.tfm \
tex-bangfont.tex \
tex-bangsl10.tfm \
tex-bangwd10.tfm \
tex-barticle.cls \
tex-bbk10.clo \
tex-bbk11.clo \
tex-bbk12.clo \
tex-bbook.cls \
tex-bletter.cls \
tex-bsize10.clo \
tex-bsize11.clo \
tex-bsize12.clo \
texlive-bangtex"

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
