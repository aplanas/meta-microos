SUMMARY = "Documentation for texlive-alertmessage"
DESCRIPTION = "This package includes the documentation for texlive-alertmessage"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn38055"

RPM_NAME = "texlive-alertmessage-doc-2023.209.1.1svn38055-55.1.noarch.rpm"
RPM_HASH = "4e2384bf47885119492cc78bd45c8aa724a8c31efd40b2dbcf2fd6a2ee0ba38a88413ceb6772729c699409279656303e35fd276f68c5687fe9c782c3dffb511d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alertmessage-doc"

RDEPENDS:${PN} += ""

inherit rpm
