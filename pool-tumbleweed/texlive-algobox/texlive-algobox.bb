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

PV = "2023.201.1.3svn52204"

RPM_NAME = "texlive-algobox-2023.201.1.3svn52204-54.1.noarch.rpm"
RPM_HASH = "e72825ca0a24c1399f8b948e484adae44ed1a2485f90cf56471cf2652e858e7fc13a0d931f940af2bb3d928bf254eda181495ef21bf676763b312c2dfa6dd827"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-algobox.sty \
texlive-algobox"

RDEPENDS:${PN} += "/bin/sh \
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
