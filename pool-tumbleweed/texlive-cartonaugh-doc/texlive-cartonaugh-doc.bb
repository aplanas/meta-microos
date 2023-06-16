SUMMARY = "Documentation for texlive-cartonaugh"
DESCRIPTION = "This package includes the documentation for texlive-cartonaugh"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn59938"

RPM_NAME = "texlive-cartonaugh-doc-2023.201.1.0svn59938-52.1.noarch.rpm"
RPM_HASH = "a8311dbb8fabf067af478e89395f31589b94c0d39ccbffb939ab2d150fa017248000ba4c135b3fe003c047b903cc8ab92ed82d319f16c7756ac41a8cc3a2c2bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cartonaugh-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
