SUMMARY = "Documentation for texlive-tocloft"
DESCRIPTION = "This package includes the documentation for texlive-tocloft"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3jsvn53364"

RPM_NAME = "texlive-tocloft-doc-2023.201.2.3jsvn53364-52.1.noarch.rpm"
RPM_HASH = "55d21f7558ddf3928ec5903eb0e55e49255163350af8d1eb7d487686660e3b6f0d70fcab6ccc2dd2a866b090a6c96d8ec38f396a129b9828bc874104efb14a20"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tocloft-doc"

RDEPENDS:${PN} += ""

inherit rpm
