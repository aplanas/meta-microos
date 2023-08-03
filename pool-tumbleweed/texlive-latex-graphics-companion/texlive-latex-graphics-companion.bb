SUMMARY = "Examples from The LaTeX Graphics Companion"
DESCRIPTION = "The source of the examples printed in the book, together with \
necessary supporting files."
LICENSE = "LPPL-1.0"

PV = "2023.209.svn29235"

RPM_NAME = "texlive-latex-graphics-companion-2023.209.svn29235-56.1.noarch.rpm"
RPM_HASH = "0549f9459420da30832d04b464c05f06cdffc3a02c499e4a0d4db40ff0fa594fde3bfe0d6b0ad677bee49e056b7b6874ebbd1264f5536a74b89ff48e76b689e2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-latex-graphics-companion"

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
