SUMMARY = "Documentation for texlive-adrconv"
DESCRIPTION = "This package includes the documentation for texlive-adrconv"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn46817"

RPM_NAME = "texlive-adrconv-doc-2023.209.1.4svn46817-55.1.noarch.rpm"
RPM_HASH = "c812e6c0437bd09d877ba062da9d4471028656ab1f51507f399bdebb71e2aae5bf7a730329987a36809418e637f588a368e8d3b5cd4815c6cc8cda1217a9133b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-adrconv-doc-de \
texlive-adrconv-doc"

RDEPENDS:${PN} += ""

inherit rpm
