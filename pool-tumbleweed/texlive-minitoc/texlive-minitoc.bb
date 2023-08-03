SUMMARY = "Produce a table of contents for each chapter, part or section"
DESCRIPTION = "The minitoc package allows you to add mini-tables-of-contents \
(minitocs) at the beginning of every chapter, part or section. \
There is also provision for mini-lists of figures and of \
tables. At the part level, they are parttocs, partlofs and \
partlots. If the type of document does not use chapters, the \
basic provision is section level secttocs, sectlofs and \
sectlots. The package has provision for language-specific \
configuration of its own 'fixed names', using .mld files \
(analagous to babel .ldf files that do that job for LaTeX's own \
fixed names)."
LICENSE = "LPPL-1.0"

PV = "2023.209.62svn61719"

RPM_NAME = "texlive-minitoc-2023.209.62svn61719-55.1.noarch.rpm"
RPM_HASH = "77a386d643e11a01c3dcfe4f405c237095a59f55d12d283372560399b0a8970655540c1fdf25088de617d8232cdfed662ad306c811b140785d0a046b98de11a7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-minitoc.sty \
tex-mtcmess.sty \
tex-mtcoff.sty \
tex-mtcpatchmem.sty \
texlive-minitoc"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-flafter.sty \
tex-notoccite.sty \
tex-placeins.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
