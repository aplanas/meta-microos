SUMMARY = "Typeset Algobox programs"
DESCRIPTION = "This LaTeX package can typeset Algobox programs almost exactly \
as displayed when editing with Algobox itself, using an input \
syntax very similar to the actual Algobox program text. It \
gives better results than Algobox's own LaTeX export which does \
not look like the editor rendition, produces standalone \
documents cumbersome to customize, and has arbitrary and \
inconsistent differences between the input syntax and the \
program text. This package depends upon the following other \
LaTeX packages: expl3, TikZ, environ, xparse, and xcolor."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3svn52204"

RPM_NAME = "texlive-algobox-2023.209.1.3svn52204-55.1.noarch.rpm"
RPM_HASH = "5a3a1a7fd8767b11c18033330ac5b6107bc031835294b2107c575e0be491c5f7d847c56351034f6f4d399b79f04421f061f74401e7a4bb2a209e4c78cd161fd7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-algobox.sty \
texlive-algobox"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-environ.sty \
tex-expl3.sty \
tex-tikz.sty \
tex-xcolor.sty \
tex-xparse.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
