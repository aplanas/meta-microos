SUMMARY = "Documentation for texlive-footnoterange"
DESCRIPTION = "This package includes the documentation for texlive-footnoterange"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1asvn66149"

RPM_NAME = "texlive-footnoterange-doc-2023.209.1.1asvn66149-53.1.noarch.rpm"
RPM_HASH = "865c84c1e1a92dd8f9e6f5fadfbd763f8737d792fb438f02b7b3a0b82c152976ad35ac2dfed4aead67330e19d76dbb69501871cf2288b4c187b7520c0ab22872"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-footnoterange-doc"

RDEPENDS:${PN} += ""

inherit rpm
