SUMMARY = "Documentation for texlive-ulem"
DESCRIPTION = "This package includes the documentation for texlive-ulem"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn53365"

RPM_NAME = "texlive-ulem-doc-2023.209.svn53365-54.1.noarch.rpm"
RPM_HASH = "b5a7b38930535fe75fe2a59696fde8ed7fd5a2919790eb2c8f28dfc7e16799988b4fa9e55358e70c135fc4f6ab05bc7bc59eb8602d54105d19292d93d0372d0b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ulem-doc"

RDEPENDS:${PN} += ""

inherit rpm
