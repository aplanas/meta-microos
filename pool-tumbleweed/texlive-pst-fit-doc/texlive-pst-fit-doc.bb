SUMMARY = "Documentation for texlive-pst-fit"
DESCRIPTION = "This package includes the documentation for texlive-pst-fit"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.02svn45109"

RPM_NAME = "texlive-pst-fit-doc-2023.201.0.0.02svn45109-52.1.noarch.rpm"
RPM_HASH = "54a94af52c70fddc2c57700257655d83fb81afe84e74d1f6302d3e01fce99fb831dbb07f6d52c4a68431771118689daf66fb133c092cb6c30db533596f2688bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-fit-doc"

RDEPENDS:${PN} += ""

inherit rpm
