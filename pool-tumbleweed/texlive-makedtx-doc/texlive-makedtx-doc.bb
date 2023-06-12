SUMMARY = "Documentation for texlive-makedtx"
DESCRIPTION = "This package includes the documentation for texlive-makedtx"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn46702"

RPM_NAME = "texlive-makedtx-doc-2023.201.1.2svn46702-52.1.noarch.rpm"
RPM_HASH = "6f0bed5479dc205e034d9efc3b754ddbca0fbca6968c9a9980c0a50c4787b70d6a7ed758a62030ce9b4b049da6ca7ebd41a6104d250ac9da9d01614b0036af4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makedtx-doc"
RDEPENDS:${PN} += ""

inherit rpm
