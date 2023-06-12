SUMMARY = "Documentation for texlive-chet"
DESCRIPTION = "This package includes the documentation for texlive-chet"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn45081"

RPM_NAME = "texlive-chet-doc-2023.201.2.2svn45081-53.1.noarch.rpm"
RPM_HASH = "954844b0096d924fcd342b8ad47ac950914f722e8c1834f303337c7686729a62ac7f7fbb0f97cfbbd7a98930a1229b6379aa4478cef64c00a944ea686272983e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chet-doc"
RDEPENDS:${PN} += ""

inherit rpm
