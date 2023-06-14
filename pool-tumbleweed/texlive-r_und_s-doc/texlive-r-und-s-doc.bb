SUMMARY = "Documentation for texlive-r_und_s"
DESCRIPTION = "This package includes the documentation for texlive-r_und_s"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3isvn15878"

RPM_NAME = "texlive-r_und_s-doc-2023.201.1.3isvn15878-53.1.noarch.rpm"
RPM_HASH = "684741be25cf53868b44223040ab218a039ee799e644792b25f29190878c8459f62a37c4c90a866867f448366ebe9368e18cd6f28d64b35e0a523eeced5fdc87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-r-und-s-doc"

RDEPENDS:${PN} += ""

inherit rpm
