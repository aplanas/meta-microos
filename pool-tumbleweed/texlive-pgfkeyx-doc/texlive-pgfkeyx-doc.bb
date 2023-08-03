SUMMARY = "Documentation for texlive-pgfkeyx"
DESCRIPTION = "This package includes the documentation for texlive-pgfkeyx"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0.1svn26093"

RPM_NAME = "texlive-pgfkeyx-doc-2023.209.0.0.0.1svn26093-52.1.noarch.rpm"
RPM_HASH = "fa859a188be4ddc164d8a0b6a46bc1d3efbfa4bc958c226b58577d822183fc73a3c1f452910571a75e9a40d0aae495187bbda4785d260491ee3860b2a723318c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pgfkeyx-doc"

RDEPENDS:${PN} += ""

inherit rpm
