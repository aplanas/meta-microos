SUMMARY = "Documentation for texlive-kix"
DESCRIPTION = "This package includes the documentation for texlive-kix"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn21606"

RPM_NAME = "texlive-kix-doc-2023.209.svn21606-56.1.noarch.rpm"
RPM_HASH = "083ff517a7858feb4dbee9da9e37ca37374775cad370f64a506073e05b94b6ddf8ae0bc6970f8ca75e5032c99c2c5d34789d440829ba9cb1b10d8f6926ea7f88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kix-doc"

RDEPENDS:${PN} += ""

inherit rpm
