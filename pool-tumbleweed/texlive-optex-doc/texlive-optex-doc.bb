SUMMARY = "Documentation for texlive-optex"
DESCRIPTION = "This package includes the documentation for texlive-optex"
LICENSE = "SUSE-Public-Domain"

PV = "2023.201.1.11svn66513"

RPM_NAME = "texlive-optex-doc-2023.201.1.11svn66513-54.1.noarch.rpm"
RPM_HASH = "43c78137f588c6b988751fa8ee6e79b54bfc1a885c700a1ffd0a877639f85bde6c6b046343bcb2b37175501ec5c372a51cf56a4298d3d1f2c49e8784aec82230"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-optex.1 \
texlive-optex-doc"

RDEPENDS:${PN} += ""

inherit rpm
