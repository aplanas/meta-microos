SUMMARY = "Documentation for texlive-secdot"
DESCRIPTION = "This package includes the documentation for texlive-secdot"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn20208"

RPM_NAME = "texlive-secdot-doc-2023.209.1.0svn20208-54.1.noarch.rpm"
RPM_HASH = "22b57770ceab05c73a808d663df6aa834379d757e1f0ab21ea6b131d46921128816cddec6b1f97470f79dc583a8d4cc32408ce7b71ee16822dff9d9d5b8e413e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-secdot-doc"

RDEPENDS:${PN} += ""

inherit rpm
