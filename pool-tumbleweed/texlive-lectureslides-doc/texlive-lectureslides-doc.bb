SUMMARY = "Documentation for texlive-lectureslides"
DESCRIPTION = "This package includes the documentation for texlive-lectureslides"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn62292"

RPM_NAME = "texlive-lectureslides-doc-2023.201.1.0svn62292-54.1.noarch.rpm"
RPM_HASH = "4c61e038b49be12229cbd79ed72a228e56c5da54fc89773d55a2acac112f440f26c08b07d4a093db8b4cfe29309a84b25553fde362c3df39de9f04b28d791841"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lectureslides-doc"
RDEPENDS:${PN} += ""

inherit rpm
