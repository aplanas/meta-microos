SUMMARY = "Documentation for texlive-gchords"
DESCRIPTION = "This package includes the documentation for texlive-gchords"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.20svn29803"

RPM_NAME = "texlive-gchords-doc-2023.209.1.20svn29803-53.1.noarch.rpm"
RPM_HASH = "c24be81a6eed6b1e69b5ed4537760145871a0a4449171c71c0bba1e87c00bdf9cf2dbb42bcb58d1f780d14e223e8b92325a14a7ceedf142ee0d25e591be475a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gchords-doc"

RDEPENDS:${PN} += ""

inherit rpm
