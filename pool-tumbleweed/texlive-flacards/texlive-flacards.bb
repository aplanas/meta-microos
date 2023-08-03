SUMMARY = "Generate flashcards for printing"
DESCRIPTION = "The flacards class provides an easy interface to produce \
flashcards. It will print several cards per page, on both sides \
of the paper."
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.1.1bsvn19440"

RPM_NAME = "texlive-flacards-2023.209.0.0.1.1bsvn19440-53.1.noarch.rpm"
RPM_HASH = "9fccd27fb39846285ebbb66f5423834882c6b59a81d04adf057975290e546916a50e51482083cd207132ba0948de8b05f45f18d82f6ce1aee5c7a3172b292e44"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-flacards.cls \
texlive-flacards"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-article.cls \
tex-geometry.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
