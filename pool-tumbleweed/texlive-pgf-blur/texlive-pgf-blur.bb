SUMMARY = "PGF/TikZ package for 'blurred' shadows"
DESCRIPTION = "The package adds blurred/faded/fuzzy shadows to PGF/TikZ \
pictures. It is configured as a TikZ/PGF library module. The \
method is similar to that of the author's pst-blur package for \
PSTricks."
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn54512"

RPM_NAME = "texlive-pgf-blur-2023.209.1.02svn54512-52.1.noarch.rpm"
RPM_HASH = "30bd2feed611ca9f80c1de3b9ebbf4a5a0736d27ff7309167a63dfabf1dbb908cc670bc5a20254ba8c3b499780331a89b3a52c843e3c00fc13e2b78b64a43040"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-tikzlibraryshadows.blur.code.tex \
texlive-pgf-blur"

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
