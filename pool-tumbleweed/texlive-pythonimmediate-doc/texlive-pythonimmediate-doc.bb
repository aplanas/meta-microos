SUMMARY = "Documentation for texlive-pythonimmediate"
DESCRIPTION = "This package includes the documentation for texlive-pythonimmediate"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.0svn66461"

RPM_NAME = "texlive-pythonimmediate-doc-2023.201.0.0.4.0svn66461-53.2.noarch.rpm"
RPM_HASH = "77e43247d1ec1440c47613d4f83ba95f2c6f3edee6b66164a3711660172930691876b96820bcdef8b1f6148e7d06c2c8c9fbe0c06aae3a9b952b9e59ea148d8a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pythonimmediate-doc"

RDEPENDS:${PN} += ""

inherit rpm
