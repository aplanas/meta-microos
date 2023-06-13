SUMMARY = "Documentation for texlive-mlmodern"
DESCRIPTION = "This package includes the documentation for texlive-mlmodern"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn57458"

RPM_NAME = "texlive-mlmodern-doc-2023.201.1.2svn57458-54.1.noarch.rpm"
RPM_HASH = "3e77a999bde738f30444079bcfd56284b0332bc128e05ab7afa425e98c6f1fb08f1937a0a43028bf47b4e7c0d0338f0e18c69a170e13c0e0d77ec69bdc4765a6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mlmodern-doc"

RDEPENDS:${PN} += ""

inherit rpm
