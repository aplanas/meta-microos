SUMMARY = "Documentation for texlive-latexdiff"
DESCRIPTION = "This package includes the documentation for texlive-latexdiff"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.3.3svn64980"

RPM_NAME = "texlive-latexdiff-doc-2023.201.1.3.3svn64980-54.1.noarch.rpm"
RPM_HASH = "2d243d699744ebcc9ec3a13c4e4371c196a879ec3cccb53a4880091e1834512eaafda4c1d1527cc8ae3c1b58ab7755a13a498df2c50da7b4cf29e4ba498c1d41"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-latexdiff-vc.1 \
man-latexdiff.1 \
man-latexrevise.1 \
texlive-latexdiff-doc"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/perl \
/usr/bin/python3"

inherit rpm
