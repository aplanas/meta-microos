SUMMARY = "Documentation for texlive-cartonaugh"
DESCRIPTION = "This package includes the documentation for texlive-cartonaugh"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn59938"

RPM_NAME = "texlive-cartonaugh-doc-2023.209.1.0svn59938-53.1.noarch.rpm"
RPM_HASH = "298f5e31fd4fdf71c7624560d572797f86c470445c70cb16b2de88f0b24525b57239de618ad282f1e232b3b29104c3907fec9d163af9ab4ba8858a881b9f14f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cartonaugh-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
