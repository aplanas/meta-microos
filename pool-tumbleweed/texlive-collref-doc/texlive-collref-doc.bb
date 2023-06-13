SUMMARY = "Documentation for texlive-collref"
DESCRIPTION = "This package includes the documentation for texlive-collref"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.0csvn46358"

RPM_NAME = "texlive-collref-doc-2023.201.2.0csvn46358-53.1.noarch.rpm"
RPM_HASH = "9690dcf81e6d154395766a6562ae5f10621f4daa5d5cb991e45458e254596fe9e52110192c44a582b422c1ce83921dee6b45e9a4926df05673c50f48c2a11ea0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-collref-doc"

RDEPENDS:${PN} += ""

inherit rpm
