SUMMARY = "Documentation for texlive-formular"
DESCRIPTION = "This package includes the documentation for texlive-formular"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0asvn15878"

RPM_NAME = "texlive-formular-doc-2023.209.1.0asvn15878-53.1.noarch.rpm"
RPM_HASH = "76d1974edbfe7f24b15976aa05c02b56980909da69fd7f1f8b015712e0930f05c3012e0ad7d4b5ddbb3c98a19f7f64761f30410910b7431f296469b1379f1e14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-formular-doc"

RDEPENDS:${PN} += ""

inherit rpm
