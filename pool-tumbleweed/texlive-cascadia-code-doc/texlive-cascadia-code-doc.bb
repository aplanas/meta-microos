SUMMARY = "Documentation for texlive-cascadia-code"
DESCRIPTION = "This package includes the documentation for texlive-cascadia-code"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.0.1svn57478"

RPM_NAME = "texlive-cascadia-code-doc-2023.209.0.0.0.1svn57478-53.1.noarch.rpm"
RPM_HASH = "f5411bb3f026668bbd3b32a90411b5a94678411f7ec06926595f5c6f6602f8e971133235706b22eda8b1960b9525359185ed88747037bb7156e82d6a0535650b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cascadia-code-doc"

RDEPENDS:${PN} += ""

inherit rpm
