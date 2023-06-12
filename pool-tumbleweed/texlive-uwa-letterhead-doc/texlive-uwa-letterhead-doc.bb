SUMMARY = "Documentation for texlive-uwa-letterhead"
DESCRIPTION = "This package includes the documentation for texlive-uwa-letterhead"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0.1svn64491"

RPM_NAME = "texlive-uwa-letterhead-doc-2023.201.1.0.1svn64491-53.1.noarch.rpm"
RPM_HASH = "7226352b0a4208db34877c789f63b65745c5a8717fb0a26905d094874fe82e5a92720741b72a8725eddcbf21865cecd960b9da7a877319be163b597eb4f628e7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uwa-letterhead-doc"
RDEPENDS:${PN} += ""

inherit rpm
