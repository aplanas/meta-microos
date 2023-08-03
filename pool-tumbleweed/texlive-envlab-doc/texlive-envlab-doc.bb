SUMMARY = "Documentation for texlive-envlab"
DESCRIPTION = "This package includes the documentation for texlive-envlab"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2svn61937"

RPM_NAME = "texlive-envlab-doc-2023.209.1.2svn61937-54.1.noarch.rpm"
RPM_HASH = "8d582336de40d9cc0c8dabd3e2e46731bb9771181eaeb1ad77ebf9e03a983cc09f0c985350b3a608ace86c7b9b408ad08f260bc23827833dce91be09294feec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-envlab-doc"

RDEPENDS:${PN} += ""

inherit rpm
