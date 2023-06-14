SUMMARY = "Format manuscripts to APA 6th edition guidelines"
DESCRIPTION = "This is a minimalist class file for formatting manuscripts in \
the style described in the American Psychological Association \
(APA) 6th edition guidelines. The apa6 class provides better \
coverage of the requirements."
LICENSE = "BSD-3-Clause"

PV = "2023.201.0.0.3svn23350"

RPM_NAME = "texlive-apa6e-2023.201.0.0.3svn23350-54.1.noarch.rpm"
RPM_HASH = "cd9597bbf447fcd485fc2827f99392d4dd035e8a67b8695c8db9ca582e58c8a34ce91f3fa110dfe05233cbf4fa3530a473f135ebb84d87fb7dcf1440f57236b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-apa6e.cls \
texlive-apa6e"

RDEPENDS:${PN} += "/bin/sh \
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
