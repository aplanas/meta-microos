SUMMARY = "Documentation for texlive-censor"
DESCRIPTION = "This package includes the documentation for texlive-censor"
LICENSE = "LPPL-1.0"

PV = "2023.209.4.2svn63126"

RPM_NAME = "texlive-censor-doc-2023.209.4.2svn63126-53.1.noarch.rpm"
RPM_HASH = "40550160382ad7e71fc21cae6d60e7774ba0427b6bf05eb9dfd7e3f156293fa2f511347ae1999b62a521fd6bd472067299407d9f1e37956dfb4da0f67c541c79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-censor-doc"

RDEPENDS:${PN} += ""

inherit rpm
