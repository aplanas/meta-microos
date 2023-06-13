SUMMARY = "Documentation for texlive-typed-checklist"
DESCRIPTION = "This package includes the documentation for texlive-typed-checklist"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn63445"

RPM_NAME = "texlive-typed-checklist-doc-2023.201.2.1svn63445-52.1.noarch.rpm"
RPM_HASH = "0dd23c35a360671560afa0877c90caba25abfb0f0bc42b3f39f594860e314a7656e70b8e9b5027da1899ed46170cbe77600d888dacf05f9650c4399436d01df4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typed-checklist-doc"

RDEPENDS:${PN} += ""

inherit rpm
