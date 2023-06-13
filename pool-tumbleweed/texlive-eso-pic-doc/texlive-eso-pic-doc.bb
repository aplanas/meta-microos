SUMMARY = "Documentation for texlive-eso-pic"
DESCRIPTION = "This package includes the documentation for texlive-eso-pic"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.0asvn56658"

RPM_NAME = "texlive-eso-pic-doc-2023.201.3.0asvn56658-52.1.noarch.rpm"
RPM_HASH = "81592d7863c92c8b3fad4dfed69d2064e1ea99ab2b11e04795949a6c73fe35e7bad531cb5881af90374805c776e8412a763844c94b0fe3505d85647f435f0d2d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eso-pic-doc"

RDEPENDS:${PN} += ""

inherit rpm
