SUMMARY = "Documentation for texlive-xcjk2uni"
DESCRIPTION = "This package includes the documentation for texlive-xcjk2uni"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn54958"

RPM_NAME = "texlive-xcjk2uni-doc-2023.201.1.0svn54958-52.1.noarch.rpm"
RPM_HASH = "bf5c05e65353c10e6ad6b53c3dff2dfb0f8a4a3808a71912253cf90233e1e2806738d292f265de48a68aa1662cae23f4175e2b43703d7022f0a2e00219669592"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-xcjk2uni-doc-zh \
texlive-xcjk2uni-doc"

RDEPENDS:${PN} += ""

inherit rpm
