SUMMARY = "Documentation for texlive-basicarith"
DESCRIPTION = "This package includes the documentation for texlive-basicarith"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn35460"

RPM_NAME = "texlive-basicarith-doc-2023.209.1.1svn35460-54.1.noarch.rpm"
RPM_HASH = "8f64483cf39e928d7b3713e9fbdd18bb775c0ec207112066a0572f07997316452beea406bf75969a6822a783eb65afbd27e1a50fc597401da3ea90e7d2a4ddb3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-basicarith-doc"

RDEPENDS:${PN} += ""

inherit rpm
