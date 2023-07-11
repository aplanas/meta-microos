SUMMARY = "Documentation for texlive-glossaries-irish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-irish"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn35665"

RPM_NAME = "texlive-glossaries-irish-doc-2023.201.1.0svn35665-53.2.noarch.rpm"
RPM_HASH = "120e85757a6f1d923fed4871a761544eb1dfb889feb9f9beb9ee33cb4b15f233bb978c33b2a641217a78223f0d7aa5fe90b97587f8161769374f4de0f59dbfec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-irish-doc"

RDEPENDS:${PN} += ""

inherit rpm
