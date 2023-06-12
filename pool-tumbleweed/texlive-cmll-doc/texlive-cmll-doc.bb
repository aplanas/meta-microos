SUMMARY = "Documentation for texlive-cmll"
DESCRIPTION = "This package includes the documentation for texlive-cmll"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn17964"

RPM_NAME = "texlive-cmll-doc-2023.201.svn17964-53.1.noarch.rpm"
RPM_HASH = "d7a5f56e6a6b8d6636168c24071a899077a879758f65c16a5ebf0f19f7fde3ca7883fae448a715b68564b96e9b8c3fad55798591f255751ab3d548e6ea6021f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmll-doc"
RDEPENDS:${PN} += ""

inherit rpm
