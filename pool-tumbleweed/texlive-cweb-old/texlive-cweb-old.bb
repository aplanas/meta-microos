SUMMARY = "Package cweb-old"
DESCRIPTION = "The cweb-old package"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn49271"

RPM_NAME = "texlive-cweb-old-2023.209.svn49271-55.1.noarch.rpm"
RPM_HASH = "fc0526d5d0843bafa23ac2dee53c481eea1d83ae0123326ff11bce1ce3896c901c9e36733909f95221b06bd37830c50743728a8ab6c78df414168b005839b5f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-pdfXcwebmac.tex \
tex-pdfcwebmac.tex \
tex-pdfdcwebmac.tex \
tex-pdffcwebmac.tex \
tex-pdficwebmac.tex \
tex-pdfwebmac.tex \
texlive-cweb-old"

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
