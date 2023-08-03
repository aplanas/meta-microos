SUMMARY = "Documentation for texlive-pdftex"
DESCRIPTION = "This package includes the documentation for texlive-pdftex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn66243"

RPM_NAME = "texlive-pdftex-doc-2023.209.svn66243-52.1.noarch.rpm"
RPM_HASH = "1e5cd5ab62d21a9d95406c481183bc2c98c2b350ac23463d4f111d3fceece1b2e1dc3f438acaeec56e1de0af7f44e72f9301abfb00848e5ce9b8d149c42a8424"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pdfetex.1 \
man-pdftex.1 \
texlive-pdftex-doc"

RDEPENDS:${PN} += "/usr/bin/perl"

inherit rpm
