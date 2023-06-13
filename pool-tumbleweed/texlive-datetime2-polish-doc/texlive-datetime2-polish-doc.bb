SUMMARY = "Documentation for texlive-datetime2-polish"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-polish"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn48456"

RPM_NAME = "texlive-datetime2-polish-doc-2023.201.1.1svn48456-52.1.noarch.rpm"
RPM_HASH = "216ad28a2527794e921371d6c0e8238c71b11070521ccae62ee1bd54f56508b77c6f5d5d0951ea0f064c598f5bd0ea2ef7a6d1593bd82c627cdf2d1a3a87047c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-polish-doc"

RDEPENDS:${PN} += ""

inherit rpm
