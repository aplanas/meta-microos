SUMMARY = "Documentation for texlive-xhfill"
DESCRIPTION = "This package includes the documentation for texlive-xhfill"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.01svn22575"

RPM_NAME = "texlive-xhfill-doc-2023.209.1.01svn22575-53.2.noarch.rpm"
RPM_HASH = "3c7cabbc1f8d505cf3ac0ae230cd0a45f795351d657cac13c212f2a9e58417b5034d18954dad5b816590a8f6021c451a4461ed5bda81bd041209439aa32e8b9c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xhfill-doc"

RDEPENDS:${PN} += ""

inherit rpm
