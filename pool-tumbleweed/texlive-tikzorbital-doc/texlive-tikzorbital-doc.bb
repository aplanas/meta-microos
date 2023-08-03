SUMMARY = "Documentation for texlive-tikzorbital"
DESCRIPTION = "This package includes the documentation for texlive-tikzorbital"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn36439"

RPM_NAME = "texlive-tikzorbital-doc-2023.209.svn36439-53.1.noarch.rpm"
RPM_HASH = "0255bccb382a1b2bfecfb6d76254e1eca480522acf9bf61a10e595fe1a01b0cd61a4413bdc44a349e6bc060ef44a63ed3a29ded534a4cbae48a469de191ebbfe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikzorbital-doc"

RDEPENDS:${PN} += ""

inherit rpm
