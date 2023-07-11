SUMMARY = "Documentation for texlive-hletter"
DESCRIPTION = "This package includes the documentation for texlive-hletter"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.2svn30002"

RPM_NAME = "texlive-hletter-doc-2023.201.4.2svn30002-53.2.noarch.rpm"
RPM_HASH = "cec397450b063846dcca9a49805177e08579d6cac8e65e9b6aab8d4a7330f0cbfc35e7dd30457b5a8709a130fcee54c3c0b6ee5b06400af89c987a42d63c4cc5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hletter-doc"

RDEPENDS:${PN} += ""

inherit rpm
