SUMMARY = "Documentation for texlive-pst-solarsystem"
DESCRIPTION = "This package includes the documentation for texlive-pst-solarsystem"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.13svn45097"

RPM_NAME = "texlive-pst-solarsystem-doc-2023.201.0.0.13svn45097-53.2.noarch.rpm"
RPM_HASH = "dbff9b4d2f210e3ed171b236d80a7b66c928660c22240d66dd6e262e3c30668885d5e5f711c3a1bcb837617c108ca0b6c7f392df8cfa69ab156dab76ecb233b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-solarsystem-doc"

RDEPENDS:${PN} += ""

inherit rpm
