SUMMARY = "Documentation for texlive-longnamefilelist"
DESCRIPTION = "This package includes the documentation for texlive-longnamefilelist"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn27889"

RPM_NAME = "texlive-longnamefilelist-doc-2023.209.0.0.2svn27889-55.1.noarch.rpm"
RPM_HASH = "3b911bea8728e5ac0cd1f095e2a99f52089cfbdf7540f6b0607650ce180a649749e40e4bd64ac79fd58cd41e84de3b96f553790cf679721e41123d1ae6e234bf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-longnamefilelist-doc"

RDEPENDS:${PN} += ""

inherit rpm
