SUMMARY = "Documentation for texlive-classpack"
DESCRIPTION = "This package includes the documentation for texlive-classpack"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.19svn55218"

RPM_NAME = "texlive-classpack-doc-2023.201.1.19svn55218-53.1.noarch.rpm"
RPM_HASH = "f2b796a78cb921f65cd67076a716910d6ec911ace57326a41b9e2fca3bdc37c53ab36fa9ebc9c11a3f6e2c22336fb475ae8e7f9e83079b4b5d8e9a9ec3e2be13"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-classpack-doc"

RDEPENDS:${PN} += ""

inherit rpm
