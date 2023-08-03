SUMMARY = "Documentation for texlive-dingbat"
DESCRIPTION = "This package includes the documentation for texlive-dingbat"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn27918"

RPM_NAME = "texlive-dingbat-doc-2023.209.1.0svn27918-53.1.noarch.rpm"
RPM_HASH = "d71e2f03a307c0ad62fa004f0b31d0595893b936f937bed7abec293d8601706bc5a8e6362ac503347d31f5e5a14dd229cdbb020efc0e791e67b9bbe78d2d2192"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dingbat-doc"

RDEPENDS:${PN} += ""

inherit rpm
