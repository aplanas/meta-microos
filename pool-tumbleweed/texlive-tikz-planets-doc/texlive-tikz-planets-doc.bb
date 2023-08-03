SUMMARY = "Documentation for texlive-tikz-planets"
DESCRIPTION = "This package includes the documentation for texlive-tikz-planets"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.2svn55002"

RPM_NAME = "texlive-tikz-planets-doc-2023.209.1.0.2svn55002-53.1.noarch.rpm"
RPM_HASH = "0bb50847ba2fea0230e84b16e67aa10e554acdf54ce3e7d3c3788b4fe6c65f53a0f8c4cd7cfb4506686dcf697164eafb4f61b70e68312211eb79a3d149e9dc4f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-planets-doc"

RDEPENDS:${PN} += ""

inherit rpm
