SUMMARY = "Documentation for texlive-thumby"
DESCRIPTION = "This package includes the documentation for texlive-thumby"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.1svn16736"

RPM_NAME = "texlive-thumby-doc-2023.209.0.0.1svn16736-55.1.noarch.rpm"
RPM_HASH = "67f9bef50c535649aa6d4a9626df76eb26bfcf04043dc9f5aee18dad7fbc810b71c52d03ca57de576a5c97b9cce4b9923d268d8781d19cedc2cb958bf69680b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thumby-doc"

RDEPENDS:${PN} += ""

inherit rpm
