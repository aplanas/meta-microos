SUMMARY = "Documentation for texlive-widetable"
DESCRIPTION = "This package includes the documentation for texlive-widetable"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn53409"

RPM_NAME = "texlive-widetable-doc-2023.209.2.1svn53409-54.1.noarch.rpm"
RPM_HASH = "e32db08cf4716bf125d796f88abb1fa1266527ecdc7f2aa12a5eb13b85c080e687335b4274bf1b5a3018d6e7be0a7a2bdd96e74d9ae266bd5858c83aad56d555"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-widetable-doc"

RDEPENDS:${PN} += ""

inherit rpm
