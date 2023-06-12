SUMMARY = "Documentation for texlive-hypdvips"
DESCRIPTION = "This package includes the documentation for texlive-hypdvips"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.03svn53197"

RPM_NAME = "texlive-hypdvips-doc-2023.201.3.03svn53197-52.1.noarch.rpm"
RPM_HASH = "3c64f71bc8de8f638b0933e93c0ab9dae1cc0908ed2b212abb3d748c218a1ce282cbe779f2975373bd73d85bd5b69382d35b4a098c246292b7d2b09f0e108a4b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hypdvips-doc"
RDEPENDS:${PN} += ""

inherit rpm
