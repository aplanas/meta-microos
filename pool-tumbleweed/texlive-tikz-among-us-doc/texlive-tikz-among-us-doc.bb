SUMMARY = "Documentation for texlive-tikz-among-us"
DESCRIPTION = "This package includes the documentation for texlive-tikz-among-us"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.0svn60880"

RPM_NAME = "texlive-tikz-among-us-doc-2023.209.1.2.0svn60880-55.1.noarch.rpm"
RPM_HASH = "3bb42a0f38622987327a4d0a78c50d3d79a009118dda2be2257f9561778fd3690a734bcace667e536ba4f78ab88c3dc00540ae875e6c921aaea5c3dcbd6990a3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-among-us-doc"

RDEPENDS:${PN} += ""

inherit rpm
