SUMMARY = "Add interactive Barcode fields to PDF forms"
DESCRIPTION = "The package extends the hyperref functionality for creating \
interactive forms to allow adding Barcode form fields supported \
by some modern PDF readers. Currently, only pdfTeX is \
supported."
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn48147"

RPM_NAME = "texlive-hyperbar-2023.201.0.0.1svn48147-52.1.noarch.rpm"
RPM_HASH = "5b162cfb342cbe81bcb92d5bfe5755fdb5a66f57415b46287ea8a6db55b8a0027f074080c6275f269b607d50c9eb9275020fe7e6731075759d552e4d5d72d7f4"
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
