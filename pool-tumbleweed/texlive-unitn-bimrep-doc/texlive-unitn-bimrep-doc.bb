SUMMARY = "Documentation for texlive-unitn-bimrep"
DESCRIPTION = "This package includes the documentation for texlive-unitn-bimrep"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45581"

RPM_NAME = "texlive-unitn-bimrep-doc-2023.209.svn45581-54.1.noarch.rpm"
RPM_HASH = "7b58c5dd614698ec8723138b1e5789a9f9111fefad29a073bfb6ba0f1e4b9b292565db8a765a4a51fda4cbcdcb0de92cd0bf735abdd98af05b5e49ebf9639845"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-unitn-bimrep-doc"

RDEPENDS:${PN} += ""

inherit rpm
