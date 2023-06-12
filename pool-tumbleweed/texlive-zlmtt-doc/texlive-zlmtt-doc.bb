SUMMARY = "Documentation for texlive-zlmtt"
DESCRIPTION = "This package includes the documentation for texlive-zlmtt"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.032svn64076"

RPM_NAME = "texlive-zlmtt-doc-2023.201.1.032svn64076-52.1.noarch.rpm"
RPM_HASH = "53dab59dfc47ed0c7278999c85e5b85dc985710f5887b66805915d0fdbf30a51dee0ffca3419a7324eb7e8fbf6089663fad179c6ac6d1f211e00741a42b640a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-zlmtt-doc"
RDEPENDS:${PN} += ""

inherit rpm
