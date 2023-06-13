SUMMARY = "A sample document in Plain TeX"
DESCRIPTION = "A file written with TeX, not using any packgages or sty-files, \
to be compiled with TeX or pdfTeX only, not with LaTeX et al."
LICENSE = "LPPL-1.0"

PV = "2023.201.2svn50985"

RPM_NAME = "texlive-texonly-2023.201.2svn50985-54.1.noarch.rpm"
RPM_HASH = "e8adcb6444d7714b067cbcfe840a326ae22f3cd71555a166eed59537097cbcff993148e6db859c677776dc1bbe0dd7f259e76f3ea15c0737e0c0b8da6163ab8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-texonly"

RDEPENDS:${PN} += "/bin/sh \
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
