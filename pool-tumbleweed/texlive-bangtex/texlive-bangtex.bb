SUMMARY = "Writing Bangla and Assamese with LaTeX"
DESCRIPTION = "The bundle provides class files for writing Bangla and Assamese \
with LaTeX, and Metafont sources for fonts."
LICENSE = "LPPL-1.0"

PV = "2023.201.svn55475"

RPM_NAME = "texlive-bangtex-2023.201.svn55475-53.1.noarch.rpm"
RPM_HASH = "dda0ddd403a2c67a765709842a2a3d731a796499ad4b65e27f3b0fb7d8693ef0f03a55c3ea248c68b0f5ab4572dfda036c9619b99d852b3aea335b0a5b8b3d33"
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
