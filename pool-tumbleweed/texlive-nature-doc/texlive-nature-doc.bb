SUMMARY = "Documentation for texlive-nature"
DESCRIPTION = "This package includes the documentation for texlive-nature"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn21819"

RPM_NAME = "texlive-nature-doc-2023.209.1.0svn21819-55.1.noarch.rpm"
RPM_HASH = "a0f98eacc8c001baca5ca305e94b620f6089966948a5192483dd17761bd575267f0dc9af549b9fbc2298438baf0c4f167b01670582c7ac7f56937063e87291d8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nature-doc"

RDEPENDS:${PN} += ""

inherit rpm
