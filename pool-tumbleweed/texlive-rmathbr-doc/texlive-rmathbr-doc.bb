SUMMARY = "Documentation for texlive-rmathbr"
DESCRIPTION = "This package includes the documentation for texlive-rmathbr"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.1svn57173"

RPM_NAME = "texlive-rmathbr-doc-2023.201.1.1.1svn57173-53.2.noarch.rpm"
RPM_HASH = "d4ca4a4595e6a77c2bb0be5fb43dc40f1c8dd828755ead55471bd9e89eaf40254fb53ca4cb065ef7b29b9c4cce559bfe3dd9946cfe0d77d9ac3cb2be5389218c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rmathbr-doc"

RDEPENDS:${PN} += ""

inherit rpm
