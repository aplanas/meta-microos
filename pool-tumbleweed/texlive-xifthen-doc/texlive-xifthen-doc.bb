SUMMARY = "Documentation for texlive-xifthen"
DESCRIPTION = "This package includes the documentation for texlive-xifthen"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4.0svn38929"

RPM_NAME = "texlive-xifthen-doc-2023.209.1.4.0svn38929-53.1.noarch.rpm"
RPM_HASH = "2ebe3bb8afa45c86955ba129a2cb9dd34bcb53613849c8d0b6f4747c633154335bdc35bf98b5fb2024bffb529a27462f04c8c945ab6d11f85b3d1b72f333e7d4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xifthen-doc"

RDEPENDS:${PN} += ""

inherit rpm
