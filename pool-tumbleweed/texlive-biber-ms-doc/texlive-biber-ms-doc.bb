SUMMARY = "Documentation for texlive-biber-ms"
DESCRIPTION = "This package includes the documentation for texlive-biber-ms"
LICENSE = "Artistic-2.0 & GPL-2.0-or-later"

PV = "2023.201.4.0_1svn66478"

RPM_NAME = "texlive-biber-ms-doc-2023.201.4.0_1svn66478-53.1.noarch.rpm"
RPM_HASH = "749b36b357662072344d0e480138600db721805bcb415d828281cebfd20b6fdf3515b7067245758f9b0518c750f3de75829bc12045340fee0d856b121cdfdbce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biber-ms-doc"
RDEPENDS:${PN} += ""

inherit rpm
