SUMMARY = "Documentation for texlive-thubeamer"
DESCRIPTION = "This package includes the documentation for texlive-thubeamer"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0svn61071"

RPM_NAME = "texlive-thubeamer-doc-2023.201.1.1.0svn61071-54.1.noarch.rpm"
RPM_HASH = "0acfe0fede15d5a5f89147a449e3c049115096284ed3151b824daef068a0f3162de0633831e8f3e09fd0066bc3e0204e6dfa1d15db8ca742f5394f813b8a668b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-thubeamer-doc:zh) \
texlive-thubeamer-doc"

RDEPENDS:${PN} += ""

inherit rpm
