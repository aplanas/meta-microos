SUMMARY = "Documentation for texlive-epigraph-keys"
DESCRIPTION = "This package includes the documentation for texlive-epigraph-keys"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn61719"

RPM_NAME = "texlive-epigraph-keys-doc-2023.209.1.0svn61719-54.2.noarch.rpm"
RPM_HASH = "9699ad95a7ccfcfa9f0f3b8a7795ead1593b8ba96aa5a5033d3387cdb389e802317c44b1d685e9af388f59b98b198352a8a1a2dcd38d9fb15696d761a0a85e01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-epigraph-keys-doc"

RDEPENDS:${PN} += ""

inherit rpm
