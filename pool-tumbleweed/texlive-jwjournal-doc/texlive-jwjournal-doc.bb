SUMMARY = "Documentation for texlive-jwjournal"
DESCRIPTION = "This package includes the documentation for texlive-jwjournal"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn65480"

RPM_NAME = "texlive-jwjournal-doc-2023.209.svn65480-56.1.noarch.rpm"
RPM_HASH = "d2fb3f7a8e623cae69d8189bb930f901b9558d5a400b4053de6b3c803a068131f947487ecb633d3b921616bc479c14e4e2d6a72b4adcd56de6ae5c86b9c84a65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-jwjournal-doc"

RDEPENDS:${PN} += ""

inherit rpm
