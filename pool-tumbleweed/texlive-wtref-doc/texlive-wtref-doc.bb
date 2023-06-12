SUMMARY = "Documentation for texlive-wtref"
DESCRIPTION = "This package includes the documentation for texlive-wtref"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.4.0svn55558"

RPM_NAME = "texlive-wtref-doc-2023.201.0.0.4.0svn55558-52.1.noarch.rpm"
RPM_HASH = "65c6ae1ebd442e4e71e1780f401038b0ceaca59bd42f13b7c41bdd4308bd722a263e214b9dcd32adbf9a382ea4f41e1c5ec8413f417267c62061bc88f9d3b3b0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(texlive-wtref-doc:ja) \
texlive-wtref-doc"
RDEPENDS:${PN} += ""

inherit rpm
