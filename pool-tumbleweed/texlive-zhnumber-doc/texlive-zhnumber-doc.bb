SUMMARY = "Documentation for texlive-zhnumber"
DESCRIPTION = "This package includes the documentation for texlive-zhnumber"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0svn66115"

RPM_NAME = "texlive-zhnumber-doc-2023.201.3.0svn66115-52.1.noarch.rpm"
RPM_HASH = "0ea6f0823808012ff985c9e19dc179faf32b80e8b91d50236404e550a4e82aa5fd1eb5c0476901b1c65f90067c7e32183a2f8edfaa189c26b87f946c97d5c3dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-zhnumber-doc:zh) \
texlive-zhnumber-doc"
RDEPENDS:${PN} += ""

inherit rpm
