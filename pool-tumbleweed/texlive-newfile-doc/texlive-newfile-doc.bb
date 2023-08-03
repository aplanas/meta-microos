SUMMARY = "Documentation for texlive-newfile"
DESCRIPTION = "This package includes the documentation for texlive-newfile"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0csvn15878"

RPM_NAME = "texlive-newfile-doc-2023.209.1.0csvn15878-55.1.noarch.rpm"
RPM_HASH = "c16e008689698c9eef063a65573f5e2aa4401056e7fd3575e0db10db0995cad69b5c0120232024a9ac38ea6341d3ab0d52fbd52918eaa9c8b1787d10d49c38da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-newfile-doc"

RDEPENDS:${PN} += ""

inherit rpm
