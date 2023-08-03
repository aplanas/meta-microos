SUMMARY = "Documentation for texlive-uwa-letterhead"
DESCRIPTION = "This package includes the documentation for texlive-uwa-letterhead"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0.1svn64491"

RPM_NAME = "texlive-uwa-letterhead-doc-2023.209.1.0.1svn64491-54.1.noarch.rpm"
RPM_HASH = "b1dd2e536d9aceb162182a521612c8a904dcd2ef8bc891cf9df99b3da917cb6656c70e87ad06df6fd465937ec05c96ddec1aea8d31235e2e8073a238b5bd5423"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uwa-letterhead-doc"

RDEPENDS:${PN} += ""

inherit rpm
