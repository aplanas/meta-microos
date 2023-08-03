SUMMARY = "Documentation for texlive-hitec"
DESCRIPTION = "This package includes the documentation for texlive-hitec"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.0betasvn15878"

RPM_NAME = "texlive-hitec-doc-2023.209.0.0.0betasvn15878-54.1.noarch.rpm"
RPM_HASH = "2ef2c5a9d5b21ffdc5d43f9d1094668931012a2dda696b50651352dd0aaef1a657375cb6fcedf5add4d6e375fc9f916524543a11f90c9660396793a123e51deb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hitec-doc"

RDEPENDS:${PN} += ""

inherit rpm
