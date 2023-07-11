SUMMARY = "Add interactive Barcode fields to PDF forms"
DESCRIPTION = "The package extends the hyperref functionality for creating \
interactive forms to allow adding Barcode form fields supported \
by some modern PDF readers. Currently, only pdfTeX is \
supported."
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.1svn48147"

RPM_NAME = "texlive-hyperbar-2023.208.0.0.1svn48147-53.1.noarch.rpm"
RPM_HASH = "cab6f78790d2273acf8f72d37190833cf4199c6698027167f678079f110f3e33884e6d97242ad87cc33dc46f60c3aea289cb1405238ad2b83df06014f41e3d22"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "tex-hyperbar.sty \
texlive-hyperbar"

RDEPENDS:${PN} += "/usr/bin/sh \
coreutils \
ed \
findutils \
grep \
sed \
tex-hyperref.sty \
texlive \
texlive-filesystem \
texlive-kpathsea \
texlive-kpathsea-bin \
texlive-scripts \
texlive-scripts-bin"

inherit rpm
