SUMMARY = "Documentation for texlive-urcls"
DESCRIPTION = "This package includes the documentation for texlive-urcls"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.1svn49903"

RPM_NAME = "texlive-urcls-doc-2023.201.2.1svn49903-53.1.noarch.rpm"
RPM_HASH = "ce4349df353a41b1d197b02a74509f3507a03911a6efe48d59c4f1dbb912cc78be3b30eed32d1bf5b4d3dc50bfddda1b0c9c7cd400bf828b59cda227ded5fa3f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-urcls-doc"

RDEPENDS:${PN} += ""

inherit rpm
