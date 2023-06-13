SUMMARY = "Documentation for texlive-minim"
DESCRIPTION = "This package includes the documentation for texlive-minim"
LICENSE = "LPPL-1.0"

PV = "2023.201.2023_1.2svn66395"

RPM_NAME = "texlive-minim-doc-2023.201.2023_1.2svn66395-54.1.noarch.rpm"
RPM_HASH = "34b5cd70d083c7e0f634798b966f4562a581e59fb2d62841916b11bc7278b4d29b516c65d87bcd88a713baca1de67a6264f8a31b7d84c4da001cfc4af8977bb6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-minim-doc"

RDEPENDS:${PN} += ""

inherit rpm
