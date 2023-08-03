SUMMARY = "Format manuscripts to APA 6th edition guidelines"
DESCRIPTION = "This is a minimalist class file for formatting manuscripts in \
the style described in the American Psychological Association \
(APA) 6th edition guidelines. The apa6 class provides better \
coverage of the requirements."
LICENSE = "BSD-3-Clause"

PV = "2023.209.0.0.3svn23350"

RPM_NAME = "texlive-apa6e-2023.209.0.0.3svn23350-55.1.noarch.rpm"
RPM_HASH = "d0f9dd2374083102e3ed52324b5f84ee124dd4786bfcc79be85ef852ff388d164544840fe06f1ae99bbfbc19b7431984e4eab1e5518eae21d0d300e641b1d46e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-apa6e.cls \
texlive-apa6e"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-caption.sty \
tex-endfloat.sty \
tex-endnotes.sty \
tex-fancyhdr.sty \
tex-float.sty \
tex-geometry.sty \
tex-ifthen.sty \
tex-mathptmx.sty \
tex-ragged2e.sty \
tex-times.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
