SUMMARY = "Documentation for texlive-pascaltriangle"
DESCRIPTION = "This package includes the documentation for texlive-pascaltriangle"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn61774"

RPM_NAME = "texlive-pascaltriangle-doc-2023.209.1.0.1svn61774-52.1.noarch.rpm"
RPM_HASH = "28065e627e6c38337355aaf5583d6c8c04d730dbd5a4394d7ee28fda55efb2c5acc4639772baab57a04ca224150a182815e4b8fa489b505266261f80220b79c1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "en) \
locale(texlive-pascaltriangle-doc-zh \
texlive-pascaltriangle-doc"

RDEPENDS:${PN} += "/usr/bin/bash"

inherit rpm
