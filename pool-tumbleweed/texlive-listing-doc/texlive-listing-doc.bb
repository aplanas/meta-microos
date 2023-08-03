SUMMARY = "Documentation for texlive-listing"
DESCRIPTION = "This package includes the documentation for texlive-listing"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn17373"

RPM_NAME = "texlive-listing-doc-2023.209.1.2svn17373-55.1.noarch.rpm"
RPM_HASH = "da13bc082b19b3cfcbb25e1159c5554c8aa7e3402207aead04e113958ab74919d88aa6fca77f024e370909b0b97f89c2d91a511d8ebd0fe3dfc4e6b88fe1e171"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-listing-doc"

RDEPENDS:${PN} += ""

inherit rpm
