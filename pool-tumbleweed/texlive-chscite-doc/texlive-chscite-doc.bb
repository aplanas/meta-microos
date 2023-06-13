SUMMARY = "Documentation for texlive-chscite"
DESCRIPTION = "This package includes the documentation for texlive-chscite"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.9999svn28552"

RPM_NAME = "texlive-chscite-doc-2023.201.2.9999svn28552-53.1.noarch.rpm"
RPM_HASH = "5ef46b7bcb77d5b5817ef3756b27c3803bebe234645a0c1f48f554e54a5fe1467fe863f0a0856708d12d33c4929b2bea8c6e74e1bafde6f637140c4dc473b637"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chscite-doc"

RDEPENDS:${PN} += ""

inherit rpm
