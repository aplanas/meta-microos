SUMMARY = "Documentation for texlive-ektype-tanka"
DESCRIPTION = "This package includes the documentation for texlive-ektype-tanka"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn63255"

RPM_NAME = "texlive-ektype-tanka-doc-2023.201.0.0.2svn63255-53.2.noarch.rpm"
RPM_HASH = "364785eedacdfd88e96b06f472512d9a58d6eaab8fd4e107907c1bf884c51d0f31345b22e858efdba34ee2227827e7667cdb0a699c085c3e7d8a9962b4943449"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hi) \
locale(texlive-ektype-tanka-doc-mr \
texlive-ektype-tanka-doc"

RDEPENDS:${PN} += ""

inherit rpm
