SUMMARY = "Documentation for texlive-datenumber"
DESCRIPTION = "This package includes the documentation for texlive-datenumber"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.03svn61761"

RPM_NAME = "texlive-datenumber-doc-2023.209.0.0.03svn61761-55.1.noarch.rpm"
RPM_HASH = "2e03723be73f4e39017154fb856ee8b6598071d57c354d9534265e6622debaa7a532c0eeb9a019c7312d64716d77a96585251883e0052e14d9527da052141ddb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-datenumber-doc-de \
texlive-datenumber-doc"

RDEPENDS:${PN} += ""

inherit rpm
