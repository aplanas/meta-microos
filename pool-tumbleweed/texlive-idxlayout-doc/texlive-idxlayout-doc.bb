SUMMARY = "Documentation for texlive-idxlayout"
DESCRIPTION = "This package includes the documentation for texlive-idxlayout"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4dsvn25821"

RPM_NAME = "texlive-idxlayout-doc-2023.201.0.0.4dsvn25821-52.1.noarch.rpm"
RPM_HASH = "592e3e4126c38e170edde2b646ac0208690cf37f736180e53fb40a346e5fad24e7260089bd85c4bf2e7d1067715dba7c88d4a6d099233078e4659ef8f47c8cbb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-idxlayout-doc-en \
texlive-idxlayout-doc"

RDEPENDS:${PN} += ""

inherit rpm
