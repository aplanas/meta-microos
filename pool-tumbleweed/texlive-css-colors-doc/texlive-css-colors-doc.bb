SUMMARY = "Documentation for texlive-css-colors"
DESCRIPTION = "This package includes the documentation for texlive-css-colors"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.02svn54512"

RPM_NAME = "texlive-css-colors-doc-2023.209.1.02svn54512-55.1.noarch.rpm"
RPM_HASH = "15496aee9eb52bfa989b2ee6c5976e493ae5c5ea93b0b1c6b81ee102d142d0c63a650120c40cf107b2b72d1deea42e64edd91b8488e7e3b87bfbad5c0090e89b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-css-colors-doc"

RDEPENDS:${PN} += ""

inherit rpm
