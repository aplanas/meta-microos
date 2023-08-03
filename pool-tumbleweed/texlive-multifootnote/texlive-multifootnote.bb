SUMMARY = "Multiple numbers for the same footnote"
DESCRIPTION = "This package provides several commands for generating footnotes \
with multiple numbers (resp. marks)."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn63456"

RPM_NAME = "texlive-multifootnote-2023.209.svn63456-55.1.noarch.rpm"
RPM_HASH = "d5a6613218725b9c5128fdf0434d8a6f0b077f66decccab87c6ef0bca9a331671878ea61bf35ab6c9964f8b7da01ee497578a1b4ba25f856a7f7676247fcb873"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-multifootnote.sty \
texlive-multifootnote"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-l3keys2e.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
