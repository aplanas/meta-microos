SUMMARY = "Documentation for texlive-schulschriften"
DESCRIPTION = "This package includes the documentation for texlive-schulschriften"
LICENSE = "LPPL-1.0"

PV = "2023.201.5svn59388"

RPM_NAME = "texlive-schulschriften-doc-2023.201.5svn59388-53.1.noarch.rpm"
RPM_HASH = "37bd1d78d1c08eb4226094fb58caa3f56d01185df3494938e01908ece25bb03d592b5c28698947ccae2cebb0f3d8df54533e683a2a48d4ee306612e7f8ab1451"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-schulschriften-doc"

RDEPENDS:${PN} += ""

inherit rpm
