SUMMARY = "Documentation for texlive-actuarialsymbol"
DESCRIPTION = "This package includes the documentation for texlive-actuarialsymbol"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn54080"

RPM_NAME = "texlive-actuarialsymbol-doc-2023.209.1.1svn54080-55.1.noarch.rpm"
RPM_HASH = "37c9cb27fa58281e6c4658f9f5ecd351a3e89a2b542daa4180398565f4930c40839f45ed955c6b56091929327d0f8332826ef7cdc01d7db83e1183eb09b9de0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-actuarialsymbol-doc"

RDEPENDS:${PN} += ""

inherit rpm
