SUMMARY = "Specify version and compression level of output PDF files"
DESCRIPTION = "This package enables users to specify in their sources the \
following settings on the PDF document to output: PDF version \
(1.4, 1.5 etc.); whether or not to compress streams; whether or \
not to use object streams. This package supports all major \
PDF-output engines and dvipdfmx."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6svn63185"

RPM_NAME = "texlive-bxpdfver-2023.209.0.0.6svn63185-53.1.noarch.rpm"
RPM_HASH = "d3d0b781f69be7076ccd79e052e5a44408854e6efc125a7b6f8657b09bb9e34a3aa5ec195b7b6f64f849aa991d62c447c3b307ff3079ef5a8e14205b751ef695"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-bxpdfver.sty \
texlive-bxpdfver"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-atbegshi.sty \
tex-ifthen.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
