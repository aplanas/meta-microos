SUMMARY = "Documentation for texlive-datetime2-greek"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-greek"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47533"

RPM_NAME = "texlive-datetime2-greek-doc-2023.209.1.1svn47533-53.1.noarch.rpm"
RPM_HASH = "184436a95ef482c2edb326a3f69ba0cdb5bb16d12a3bb300f8a9fccc86f3df5c9a8827e5fab89686314d46c8a9fe30424ca5777f6442eecad3025ea5d3dcf001"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-greek-doc"

RDEPENDS:${PN} += ""

inherit rpm
