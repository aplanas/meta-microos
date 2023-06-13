SUMMARY = "Documentation for texlive-pictex"
DESCRIPTION = "This package includes the documentation for texlive-pictex"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1bsvn59551"

RPM_NAME = "texlive-pictex-doc-2023.201.1.1bsvn59551-51.1.noarch.rpm"
RPM_HASH = "febb44bb69bff9818923035280090c39e9ea047ce2f0b32ab37029dff84c651433f1285354e79dfb88704650473fa6f2ff1fe1955dd17a2ce89e3ca5ab04b7ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pictex-doc"

RDEPENDS:${PN} += ""

inherit rpm
