SUMMARY = "Document classes for Karel de Grote University College"
DESCRIPTION = "The bundle provides two classes for usage by KdG professors and \
master students: kdgcoursetext: for writing course texts, and \
kdgmasterthesis: for writing master's theses. The bundle \
replaces the original kdgcoursetext package (now removed from \
the archive)."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn24498"

RPM_NAME = "texlive-kdgdocs-2023.209.1.0svn24498-56.1.noarch.rpm"
RPM_HASH = "8e4fca3056f193240c1a5bfa365c06ebd59feb530373a6b0ff8a0b8c7f090928ed4c1ebe7fe63c172ecae62e9afe065da0af6717bc501b190ac554a51bacc81e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-kdgcoursetext.cls \
tex-kdgmasterthesis.cls \
texlive-kdgdocs"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-cmbright.sty \
tex-color.sty \
tex-eso-pic.sty \
tex-fancyhdr.sty \
tex-fontspec.sty \
tex-geometry.sty \
tex-graphicx.sty \
tex-hyperref.sty \
tex-ifthen.sty \
tex-ifxetex.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
