SUMMARY = "Documentation for texlive-tikz-feynman"
DESCRIPTION = "This package includes the documentation for texlive-tikz-feynman"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1.0svn56615"

RPM_NAME = "texlive-tikz-feynman-doc-2023.201.1.1.0svn56615-52.1.noarch.rpm"
RPM_HASH = "59b28d46e0739e0f34070a808306621464dc51c8e31bbfd042d42ea86255c8e63c8dff57679d1571e40d5126168990eecd74a2d0dbf3df20c6c883c8667cdf84"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-feynman-doc"

RDEPENDS:${PN} += ""

inherit rpm
