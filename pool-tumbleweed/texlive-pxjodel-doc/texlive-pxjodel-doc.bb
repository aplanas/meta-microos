SUMMARY = "Documentation for texlive-pxjodel"
DESCRIPTION = "This package includes the documentation for texlive-pxjodel"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn64072"

RPM_NAME = "texlive-pxjodel-doc-2023.201.0.0.3svn64072-53.2.noarch.rpm"
RPM_HASH = "5b3cc9f926471df8059eb39619ea6e2108c688a12848489880e193424d7c82ab0cf25aa4a38bd9208e21d5559d257c0825f0fe247d0aa074a477581e944216fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pxjodel-doc"

RDEPENDS:${PN} += ""

inherit rpm
