SUMMARY = "Documentation for texlive-bbding"
DESCRIPTION = "This package includes the documentation for texlive-bbding"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn17186"

RPM_NAME = "texlive-bbding-doc-2023.201.1.01svn17186-53.1.noarch.rpm"
RPM_HASH = "0a298442a27fb37056c77346260770412320036c0b41150a63ecb8d7b298ad24eeedb70ed20fdae957693d10fca8489403ec71f05c9cb953e47939bf6aa2d85e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bbding-doc"

RDEPENDS:${PN} += ""

inherit rpm
