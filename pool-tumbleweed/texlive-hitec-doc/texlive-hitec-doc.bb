SUMMARY = "Documentation for texlive-hitec"
DESCRIPTION = "This package includes the documentation for texlive-hitec"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.0betasvn15878"

RPM_NAME = "texlive-hitec-doc-2023.201.0.0.0betasvn15878-53.1.noarch.rpm"
RPM_HASH = "d2cbd418ac114046f4518e1745df4fd89c39d692bbd16a12eac7f97c0f2861d370738a86d63408b620c7fc1b49bf33d1652eae4d1d59ea5862d67589bdff820e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hitec-doc"

RDEPENDS:${PN} += ""

inherit rpm
