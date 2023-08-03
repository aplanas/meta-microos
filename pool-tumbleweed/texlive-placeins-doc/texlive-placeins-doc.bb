SUMMARY = "Documentation for texlive-placeins"
DESCRIPTION = "This package includes the documentation for texlive-placeins"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.2.2svn19848"

RPM_NAME = "texlive-placeins-doc-2023.209.2.2svn19848-52.1.noarch.rpm"
RPM_HASH = "783f7c913adfacf8faa08103fbda2684f64b07e8adea80a5230c2d4b8eafad6540e380b5ba78e5ab5624b532e25b0b328632c60184664476d3d7008dc8c6d3ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-placeins-doc"

RDEPENDS:${PN} += ""

inherit rpm
