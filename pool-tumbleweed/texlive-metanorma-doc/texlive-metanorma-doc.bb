SUMMARY = "Documentation for texlive-metanorma"
DESCRIPTION = "This package includes the documentation for texlive-metanorma"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5.0svn55010"

RPM_NAME = "texlive-metanorma-doc-2023.201.0.0.5.0svn55010-54.1.noarch.rpm"
RPM_HASH = "31eaa97894eb334b19ba9aa638e0aa269b05c71d30150f3fa6eef8bd7c9aff62b30f12e0712324f9ebc4b0d0876b983e1f96aa18c8c0fe69e23ba2f3e201618d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metanorma-doc"
RDEPENDS:${PN} += ""

inherit rpm
