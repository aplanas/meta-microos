SUMMARY = "Documentation for texlive-mathdots"
DESCRIPTION = "This package includes the documentation for texlive-mathdots"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.9svn34301"

RPM_NAME = "texlive-mathdots-doc-2023.208.0.0.9svn34301-53.1.noarch.rpm"
RPM_HASH = "4107f6fc78a98a2cd94e4238f0c935721d4f2b8808dbeb470b8e010b7c298b6114803de11240b6e8da7ae3d1d604ca8243023018d41e9697f23b487c53ffe4df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathdots-doc"

RDEPENDS:${PN} += ""

inherit rpm
