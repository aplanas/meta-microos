SUMMARY = "Documentation for texlive-cryptocode"
DESCRIPTION = "This package includes the documentation for texlive-cryptocode"
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.44svn60249"

RPM_NAME = "texlive-cryptocode-doc-2023.204.0.0.44svn60249-54.1.noarch.rpm"
RPM_HASH = "384106c29c9a7f05cdce5cc3c94aa6f85baad5e63cfb5819c4e1b9a6b97f76825f97901dfc58eef98660ea409df956dc2379cd0cb541e1dc06785389287c8add"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cryptocode-doc"

RDEPENDS:${PN} += ""

inherit rpm
