SUMMARY = "Documentation for texlive-ladder"
DESCRIPTION = "This package includes the documentation for texlive-ladder"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn44394"

RPM_NAME = "texlive-ladder-doc-2023.201.svn44394-55.1.noarch.rpm"
RPM_HASH = "e0399817f120346c2a95112330804bbc9468570c6c42ffd3c15ccd216bb684d23e38fec3698b6a9e8f053e1161fd9c8b1d850aa728a029961af8cc815310da43"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ladder-doc"

RDEPENDS:${PN} += ""

inherit rpm
