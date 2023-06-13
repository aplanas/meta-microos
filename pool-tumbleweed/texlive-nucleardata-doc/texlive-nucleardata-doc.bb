SUMMARY = "Documentation for texlive-nucleardata"
DESCRIPTION = "This package includes the documentation for texlive-nucleardata"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn47307"

RPM_NAME = "texlive-nucleardata-doc-2023.201.1.1svn47307-54.1.noarch.rpm"
RPM_HASH = "fab32ab1ebcf1253b64be9d64cda14c13032dc46f20134b1071bdb975d31ef587d4be86549e41b40440e57ea4d8f7da295896b02a8d086c90c6a03775bcc664e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nucleardata-doc"

RDEPENDS:${PN} += ""

inherit rpm
