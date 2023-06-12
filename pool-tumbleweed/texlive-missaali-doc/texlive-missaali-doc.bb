SUMMARY = "Documentation for texlive-missaali"
DESCRIPTION = "This package includes the documentation for texlive-missaali"
LICENSE = "OFL-1.1"

PV = "2023.201.2.0svn61719"

RPM_NAME = "texlive-missaali-doc-2023.201.2.0svn61719-54.1.noarch.rpm"
RPM_HASH = "5c3f6450e6c823a321637c73f433293de369a9540894776694812c8e7205b16ee7fe46c2ed672610a778ad5834f05dadd93beeba3e6289554a9f0f153c555c3e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-missaali-doc"
RDEPENDS:${PN} += ""

inherit rpm
