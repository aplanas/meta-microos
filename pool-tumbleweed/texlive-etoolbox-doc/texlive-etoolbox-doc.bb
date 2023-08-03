SUMMARY = "Documentation for texlive-etoolbox"
DESCRIPTION = "This package includes the documentation for texlive-etoolbox"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.5ksvn56554"

RPM_NAME = "texlive-etoolbox-doc-2023.209.2.5ksvn56554-53.1.noarch.rpm"
RPM_HASH = "d89cf0bd59bae32c363a48512577affad5da14e3f389c6b9abaa0e1fcc6e72e153a672313b771a7c0128477c6e63a9a9dcb6a8a44511bfa3407b6b2a48ad773b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-etoolbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
