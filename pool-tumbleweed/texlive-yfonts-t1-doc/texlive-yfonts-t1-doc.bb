SUMMARY = "Documentation for texlive-yfonts-t1"
DESCRIPTION = "This package includes the documentation for texlive-yfonts-t1"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn36013"

RPM_NAME = "texlive-yfonts-t1-doc-2023.201.1.0svn36013-52.2.noarch.rpm"
RPM_HASH = "7358848ab5b06b0f0e27f2b2545d2b6bd472e7834123000d6c766a822c597174d870597fd6c09a7aefba28874f84a7ed359bb304247ac3c20b38ae4d4f069af2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-yfonts-t1-doc"

RDEPENDS:${PN} += ""

inherit rpm
