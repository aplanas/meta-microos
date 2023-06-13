SUMMARY = "Documentation for texlive-ed"
DESCRIPTION = "This package includes the documentation for texlive-ed"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.8svn25231"

RPM_NAME = "texlive-ed-doc-2023.201.1.8svn25231-53.1.noarch.rpm"
RPM_HASH = "8b12b8ce047702920518223c2b8dc1f9ed870b028ca2344cd316b508c06cfd7248580c3d5a8e501ad9491ebd5f876f607c9bc5cbc1af0d3523e4ebc17bd5f564"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ed-doc"

RDEPENDS:${PN} += ""

inherit rpm
