SUMMARY = "Documentation for texlive-gridset"
DESCRIPTION = "This package includes the documentation for texlive-gridset"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn53762"

RPM_NAME = "texlive-gridset-doc-2023.209.0.0.3svn53762-54.1.noarch.rpm"
RPM_HASH = "4bf600d3b73f62f4ff23e69c989e421c8101837ef7d6d687d276a7fb8150513d6a19eeb975dff6e5f5128ee9493cfa94288fd9f53f530904f5a3dc2e716e9a89"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gridset-doc"

RDEPENDS:${PN} += ""

inherit rpm
