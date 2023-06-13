SUMMARY = "Documentation for texlive-polski"
DESCRIPTION = "This package includes the documentation for texlive-polski"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.3.6svn60322"

RPM_NAME = "texlive-polski-doc-2023.201.1.3.6svn60322-52.1.noarch.rpm"
RPM_HASH = "8b09c5a77254f5224eb4aa81d60f897449c3a7b43ac2e36e5c826bddc4ac63bfd1e3acda66dcb1087e7211f916bf59d6a6068ff3e0c0e147877128c131d6934b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-polski-doc:pl) \
texlive-polski-doc"

RDEPENDS:${PN} += ""

inherit rpm
