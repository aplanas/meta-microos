SUMMARY = "Add interactive Barcode fields to PDF forms"
DESCRIPTION = "The package extends the hyperref functionality for creating \
interactive forms to allow adding Barcode form fields supported \
by some modern PDF readers. Currently, only pdfTeX is \
supported."
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn48147"

RPM_NAME = "texlive-hyperbar-2023.209.0.0.1svn48147-54.1.noarch.rpm"
RPM_HASH = "e68f4b3b29ec7cb75821fedbcdf9c977f1612a2783fdaec0ff8277c52f244b82488aeb48f615bf5caf1da70e5886e6195e6cde70a7867d98eda08a935acf8fc1"
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
