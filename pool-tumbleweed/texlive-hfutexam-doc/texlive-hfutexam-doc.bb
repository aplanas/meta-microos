SUMMARY = "Documentation for texlive-hfutexam"
DESCRIPTION = "This package includes the documentation for texlive-hfutexam"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn66550"

RPM_NAME = "texlive-hfutexam-doc-2023.201.1.7svn66550-53.1.noarch.rpm"
RPM_HASH = "e7bed46cf0cc6e14f8956595de25ca8130e16539b41abc076ebcddd8755faa16ce14c02499d3bdfbcf17ef0465d7b84f4d3ac9f0c6b1ef14d3906a58c148822a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hfutexam-doc"

RDEPENDS:${PN} += ""

inherit rpm
