SUMMARY = "Documentation for texlive-boolexpr"
DESCRIPTION = "This package includes the documentation for texlive-boolexpr"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.14svn17830"

RPM_NAME = "texlive-boolexpr-doc-2023.209.3.14svn17830-53.1.noarch.rpm"
RPM_HASH = "30fdaa44314f9622948789db7793e3945841deedafe7a5bd9a62a95472577f0eb46be950ae3922c129dae30956e57b9903de2cb8a2a6c392c8d899b405543a5d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-boolexpr-doc"

RDEPENDS:${PN} += ""

inherit rpm
