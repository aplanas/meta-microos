SUMMARY = "Documentation for texlive-elteikthesis"
DESCRIPTION = "This package includes the documentation for texlive-elteikthesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.3svn63186"

RPM_NAME = "texlive-elteikthesis-doc-2023.209.2.3svn63186-54.2.noarch.rpm"
RPM_HASH = "3905b45b5c29c069f767238055bab75e4e258610018ebb8ad9c20f4bed0fc512fc05aa239dd10dc4ac770fd5dcb1bfda3abac8b0ec16ae539ddcf9193a6e5f92"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-elteikthesis-doc-en;hu \
texlive-elteikthesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
