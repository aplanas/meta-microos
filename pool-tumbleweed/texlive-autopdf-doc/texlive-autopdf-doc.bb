SUMMARY = "Documentation for texlive-autopdf"
DESCRIPTION = "This package includes the documentation for texlive-autopdf"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn32377"

RPM_NAME = "texlive-autopdf-doc-2023.201.1.1svn32377-53.1.noarch.rpm"
RPM_HASH = "d32bb40012e476a9165c5dc6b608c4e5b5b46f41c84a201e3f83fa1864a255a3735eb6b50f0099ae49570f7fe5b75cc8e06c29e1059a4d5a114688e572faa5cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-autopdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
