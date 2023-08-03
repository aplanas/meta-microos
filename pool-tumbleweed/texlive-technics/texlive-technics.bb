SUMMARY = "A package to format technical documents"
DESCRIPTION = "The package provides a very simple LaTeX document template, in \
the hope that this use of LaTeX will become attractive to \
typical word processor users. (Presentation is as if it were a \
class; users are expected to start from a template document.)"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn29349"

RPM_NAME = "texlive-technics-2023.209.1.0svn29349-55.1.noarch.rpm"
RPM_HASH = "47fb08e7160e2fce3d89527c5ef2f4a3cac4904aae9f5c945e223a907ef7a4b394c3f6d5f213ceb4546eca1642adcd7a0970a5537225643c386f262831b3c410"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-technics.sty \
texlive-technics"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-a4wide.sty \
tex-calc.sty \
tex-fancyhdr.sty \
tex-fontenc.sty \
tex-graphics.sty \
tex-hyperref.sty \
tex-inputenc.sty \
tex-multicol.sty \
tex-setspace.sty \
tex-times.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
