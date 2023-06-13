SUMMARY = "Documentation for texlive-bondgraphs"
DESCRIPTION = "This package includes the documentation for texlive-bondgraphs"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn36605"

RPM_NAME = "texlive-bondgraphs-doc-2023.201.1.0.1svn36605-52.1.noarch.rpm"
RPM_HASH = "f34f29eb1e79d8a5a7a85e65b009f7c1f004993c8c00199d1b3de8a86cfed43370c39f692114969be92850de8374d962ef77394ff59bd1f9670b4da6ae4b1da9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bondgraphs-doc"

RDEPENDS:${PN} += ""

inherit rpm
