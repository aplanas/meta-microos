SUMMARY = "Documentation for texlive-crbox"
DESCRIPTION = "This package includes the documentation for texlive-crbox"
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.1svn29803"

RPM_NAME = "texlive-crbox-doc-2023.204.0.0.1svn29803-54.1.noarch.rpm"
RPM_HASH = "1ec85a38e175e65f40bc36a49b8f1b6fd0d68df4ad0795a22c87d969e9d1c2a344c25a169ec7a34e6441ccdc70f433e090fc301b569379dc6995ee1f91be8618"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-crbox-doc"

RDEPENDS:${PN} += ""

inherit rpm
