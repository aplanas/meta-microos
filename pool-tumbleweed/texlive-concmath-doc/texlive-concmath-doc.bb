SUMMARY = "Documentation for texlive-concmath"
DESCRIPTION = "This package includes the documentation for texlive-concmath"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17219"

RPM_NAME = "texlive-concmath-doc-2023.201.svn17219-53.1.noarch.rpm"
RPM_HASH = "ba4c23e189678c3627507f82d1b353341b874902b6ab76cdbd43899e7a89ae4e41987fc26e19b14efc4ce71be6c93073ab3a3252969d02e33b794d2f78e18238"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-concmath-doc"
RDEPENDS:${PN} += ""

inherit rpm
