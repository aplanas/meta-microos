SUMMARY = "Documentation for texlive-go"
DESCRIPTION = "This package includes the documentation for texlive-go"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.svn28628"

RPM_NAME = "texlive-go-doc-2023.209.svn28628-54.2.noarch.rpm"
RPM_HASH = "9a941cefc9176dc0b25f6996e306fa1dc3d6d48bd7b2e1cc08eb3e8247365277f268eb8d96e347d3e8337b2782f4a170505ffa343814881368b98e087c1419f5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-go-doc"

RDEPENDS:${PN} += ""

inherit rpm
