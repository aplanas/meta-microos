SUMMARY = "Documentation for texlive-erewhon-math"
DESCRIPTION = "This package includes the documentation for texlive-erewhon-math"
LICENSE = "OFL-1.1"

PV = "2023.209.0.0.56svn65684"

RPM_NAME = "texlive-erewhon-math-doc-2023.209.0.0.56svn65684-54.2.noarch.rpm"
RPM_HASH = "437b9c696c4f2609e227224e894499b3224ef4f9e32cc2a1b3cd1683797e15a611fb8f72b25725fc70aab359ad1d1a5a5a722498c20c9f8d77bc20ce8188ced5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-erewhon-math-doc"

RDEPENDS:${PN} += ""

inherit rpm
