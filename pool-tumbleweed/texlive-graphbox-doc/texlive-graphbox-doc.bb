SUMMARY = "Documentation for texlive-graphbox"
DESCRIPTION = "This package includes the documentation for texlive-graphbox"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn46360"

RPM_NAME = "texlive-graphbox-doc-2023.201.1.1svn46360-53.1.noarch.rpm"
RPM_HASH = "3901d50103299dcb403a0ad5e6292bf45ab5475684257bb5f18fbdb03879fafbae176ef30216059413df96747cc8354d7d560d0e56bf38da360425284da6b083"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-graphbox-doc"
RDEPENDS:${PN} += ""

inherit rpm
