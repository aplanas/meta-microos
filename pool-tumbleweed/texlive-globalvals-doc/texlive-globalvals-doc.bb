SUMMARY = "Documentation for texlive-globalvals"
DESCRIPTION = "This package includes the documentation for texlive-globalvals"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn49962"

RPM_NAME = "texlive-globalvals-doc-2023.209.1.1svn49962-54.2.noarch.rpm"
RPM_HASH = "3e75fa7550bc6d510a47a2652917fc063cd696e6f86a64dcd028c735f1feb89e23aa5a70fc2a2d4cc074e9f94cfd65268ef0c888f621d22280411c4d58dc85e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-globalvals-doc"

RDEPENDS:${PN} += ""

inherit rpm
