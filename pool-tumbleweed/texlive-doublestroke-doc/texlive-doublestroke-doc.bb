SUMMARY = "Documentation for texlive-doublestroke"
DESCRIPTION = "This package includes the documentation for texlive-doublestroke"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.111svn15878"

RPM_NAME = "texlive-doublestroke-doc-2023.209.1.111svn15878-53.1.noarch.rpm"
RPM_HASH = "fea38634e90cce12207fcd50c48e3077d0998e19f5fcf60e36057860119ecd139476784560cc27cbbb4d75ba73cbe55a35984de5e1c0afd4e6484f3ec9ab8195"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-doublestroke-doc"

RDEPENDS:${PN} += ""

inherit rpm
