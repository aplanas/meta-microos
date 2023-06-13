SUMMARY = "Documentation for texlive-moreverb"
DESCRIPTION = "This package includes the documentation for texlive-moreverb"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.3asvn22126"

RPM_NAME = "texlive-moreverb-doc-2023.201.2.3asvn22126-54.1.noarch.rpm"
RPM_HASH = "21847d42ec04b29d3e24aa903358ac1975e267a2baeb8206265a7223fbcc8a12c1dc436753aa253a42a29623facee442ecae0defaaf68f44a3131fc3ca864077"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-moreverb-doc"

RDEPENDS:${PN} += ""

inherit rpm
