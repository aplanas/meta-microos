SUMMARY = "Documentation for texlive-uassign"
DESCRIPTION = "This package includes the documentation for texlive-uassign"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn38459"

RPM_NAME = "texlive-uassign-doc-2023.201.1.01svn38459-52.1.noarch.rpm"
RPM_HASH = "32a723f50706cdedaa42432c0c6e01caa2eb945576ad71c6df6e4dc78c27f8db663133b6b19d56bd1c16c4045ccbfd471debe068c8e7da387bcbc1e72e23bbff"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uassign-doc"

RDEPENDS:${PN} += ""

inherit rpm
