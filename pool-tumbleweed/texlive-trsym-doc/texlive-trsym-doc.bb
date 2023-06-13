SUMMARY = "Documentation for texlive-trsym"
DESCRIPTION = "This package includes the documentation for texlive-trsym"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn18732"

RPM_NAME = "texlive-trsym-doc-2023.201.1.0svn18732-52.1.noarch.rpm"
RPM_HASH = "2f5cb193ae670977d60d7e2a59c970758be07d1a58f1671a2ec17987e2a40ea3f8487e3a37abc452e8ec16c5042148cc6b64563f713615135a746cf406ad3fdd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-trsym-doc"

RDEPENDS:${PN} += ""

inherit rpm
