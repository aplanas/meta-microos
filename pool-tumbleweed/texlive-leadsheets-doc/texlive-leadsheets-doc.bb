SUMMARY = "Documentation for texlive-leadsheets"
DESCRIPTION = "This package includes the documentation for texlive-leadsheets"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.7svn61504"

RPM_NAME = "texlive-leadsheets-doc-2023.201.0.0.7svn61504-54.1.noarch.rpm"
RPM_HASH = "3772bb725ff26cfff74804b5300034b7b804ff85586a3239a3eaadbb7d07814a34ec722b2d00f4977cfa7ccc19a7715dfd21e43070c0ef29f75e7f6672ca34ec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-leadsheets-doc"

RDEPENDS:${PN} += ""

inherit rpm
