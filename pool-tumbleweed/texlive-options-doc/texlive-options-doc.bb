SUMMARY = "Documentation for texlive-options"
DESCRIPTION = "This package includes the documentation for texlive-options"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn39030"

RPM_NAME = "texlive-options-doc-2023.201.1.0svn39030-54.1.noarch.rpm"
RPM_HASH = "51bfd6b4a718e6b03e1f276da3d5fb1997f35562e0365c145d37b41dbf8321bb662f90c609d00662079b5152382f320a4f264d5f9d6046b65caf132fca805c6c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-options-doc"
RDEPENDS:${PN} += ""

inherit rpm
