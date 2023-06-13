SUMMARY = "Documentation for texlive-ltxdockit"
DESCRIPTION = "This package includes the documentation for texlive-ltxdockit"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2dsvn21869"

RPM_NAME = "texlive-ltxdockit-doc-2023.201.1.2dsvn21869-52.1.noarch.rpm"
RPM_HASH = "44a99f8cd9b3b01de561f6305736b6883fc7e081bc7e7c0fa1a5d3d43fad2d36aa854d0af476a9af3d3797c6a7fb904da41b8656e4a13363561f83050504931d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ltxdockit-doc"

RDEPENDS:${PN} += ""

inherit rpm
