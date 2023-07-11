SUMMARY = "Documentation for texlive-regstats"
DESCRIPTION = "This package includes the documentation for texlive-regstats"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0hsvn25050"

RPM_NAME = "texlive-regstats-doc-2023.201.1.0hsvn25050-53.2.noarch.rpm"
RPM_HASH = "e148d7ffe3d15ea4fabe08c0f21baa0a8551be7eec7703e258227a56ee2a6344b6daab1b52afa6400ee940d6b000a874c172935f85c0c7a5f27f6945b04640c6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-regstats-doc"

RDEPENDS:${PN} += ""

inherit rpm
