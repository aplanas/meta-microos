SUMMARY = "Documentation for texlive-pixelarttikz"
DESCRIPTION = "This package includes the documentation for texlive-pixelarttikz"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.0svn65649"

RPM_NAME = "texlive-pixelarttikz-doc-2023.209.0.0.1.0svn65649-52.1.noarch.rpm"
RPM_HASH = "bc095b7996a4915ca4b1cd0deb8a66add1cb77d57291da43141c527bc7e4514a2563e3fc1ec6d1b90baf2f57dbe9f0844027d7a8c048dd8c2c12e5141d5abc4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pixelarttikz-doc-fr \
texlive-pixelarttikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
