SUMMARY = "Documentation for texlive-diadia"
DESCRIPTION = "This package includes the documentation for texlive-diadia"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn37656"

RPM_NAME = "texlive-diadia-doc-2023.201.1.1svn37656-52.1.noarch.rpm"
RPM_HASH = "ecdb6f844747dcf3cd4d620e43f9a8e51f2de9ad084bcc3e6328bcc24b36202fd20293fabdaf208930852124249c84331afc10ddda160ad8f4d71093ebe78322"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-diadia-doc"
RDEPENDS:${PN} += ""

inherit rpm
