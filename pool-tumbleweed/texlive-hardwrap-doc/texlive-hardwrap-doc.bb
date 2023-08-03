SUMMARY = "Documentation for texlive-hardwrap"
DESCRIPTION = "This package includes the documentation for texlive-hardwrap"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn21396"

RPM_NAME = "texlive-hardwrap-doc-2023.209.0.0.2svn21396-54.1.noarch.rpm"
RPM_HASH = "c0c0a984536ffb3a7c37c0afbc006f2522db059946b5b5c7235e4fab717e392d3cd948222811a873929ef0e8c3a0a0396102b890a8fcceb2d86bc1873f9bb4f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hardwrap-doc"

RDEPENDS:${PN} += ""

inherit rpm
