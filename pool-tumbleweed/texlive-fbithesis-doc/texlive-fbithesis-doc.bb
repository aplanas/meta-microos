SUMMARY = "Documentation for texlive-fbithesis"
DESCRIPTION = "This package includes the documentation for texlive-fbithesis"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2msvn21340"

RPM_NAME = "texlive-fbithesis-doc-2023.201.1.2msvn21340-52.1.noarch.rpm"
RPM_HASH = "5c42879378ce7a6c121b541cd992b99dd3885cd85a71bc0d6d40bdc5954739f32b502176eb9728a6c8b16585789954ec024358f969ce0ae944ba99518e49b642"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fbithesis-doc"
RDEPENDS:${PN} += ""

inherit rpm
