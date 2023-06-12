SUMMARY = "Documentation for texlive-clipboard"
DESCRIPTION = "This package includes the documentation for texlive-clipboard"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn47747"

RPM_NAME = "texlive-clipboard-doc-2023.201.0.0.3svn47747-53.1.noarch.rpm"
RPM_HASH = "3b4c65964b6cc83bc313526f387e9c68271d981be72480950b1c5360f4cf4341aa6a07fc8ef25af3f543e44289aaa7b5fde83fdd68d30066069d977f14aff0d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-clipboard-doc"
RDEPENDS:${PN} += ""

inherit rpm
