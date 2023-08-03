SUMMARY = "Drawing of Vectorian ornaments with PGF/TikZ"
DESCRIPTION = "This package allows the drawing of Vectorian ornaments (196) \
with PGF/TikZ. The documentation presents the syntax and \
parameters of the macro 'pgfornament'."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn55326"

RPM_NAME = "texlive-pgfornament-2023.209.1.2svn55326-52.1.noarch.rpm"
RPM_HASH = "c3e010b8a96614f4a17d562609e164111e2e8c20f2586e95a19f1bf2b5e8c58bdbb7258d6cb21db5a6b4578916e71f5f47eb2a394957f3ca0069a78458f4f0f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pgflibraryam.code.tex \
tex-pgflibrarypgfhan.code.tex \
tex-pgflibraryvectorian.code.tex \
tex-pgfornament.sty \
tex-tikzrput.sty \
texlive-pgfornament"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-iftex.sty \
tex-pgfopts.sty \
tex-tikz.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
