SUMMARY = "Documentation for texlive-linebreaker"
DESCRIPTION = "This package includes the documentation for texlive-linebreaker"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1bsvn66461"

RPM_NAME = "texlive-linebreaker-doc-2023.201.0.0.1bsvn66461-54.1.noarch.rpm"
RPM_HASH = "74c0d44170090dc121945313faa0a4b01a9c747e77ff149ff7db8de2fb7307aa0139d155872d1328d7ac4a1a19a7b28e45f234985e0aa82df1364ceb58c9a580"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-linebreaker-doc"

RDEPENDS:${PN} += ""

inherit rpm
