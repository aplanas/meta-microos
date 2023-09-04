SUMMARY = "Class for documentation"
DESCRIPTION = "An article-based class designed for use for documentation in \
high-technology companies."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0betasvn15878"

RPM_NAME = "texlive-hitec-2023.209.0.0.0betasvn15878-54.2.noarch.rpm"
RPM_HASH = "36568de7b5f6edae952740e8c39b654ff49286ebd29fc7ba85a4637ace0686f78c4f78eaf04004dd9ae05937a25e7c013f879c89a46ade83728da2dddc0a1aab"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hitec.cls \
texlive-hitec"

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
