SUMMARY = "Documentation for texlive-hycolor"
DESCRIPTION = "This package includes the documentation for texlive-hycolor"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.10svn53584"

RPM_NAME = "texlive-hycolor-doc-2023.208.1.10svn53584-53.1.noarch.rpm"
RPM_HASH = "b53254d33d8f9c8062a589bbcea30b747fefb5e8bfddf9aa1943f28beccd20e9275528ccfce489f4e5ee6a19c047d8971b84aff96ed27a4db01de0772d041ac6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-hycolor-doc-en \
texlive-hycolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
