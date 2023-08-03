SUMMARY = "Documentation for texlive-oscola"
DESCRIPTION = "This package includes the documentation for texlive-oscola"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.7svn54328"

RPM_NAME = "texlive-oscola-doc-2023.209.1.7svn54328-55.1.noarch.rpm"
RPM_HASH = "4926336e50b3939314172a72afc13e251d35e934be16b60fd92369f665fc63aef5e102dfd490707b39836b0b320f6ce1f0f23b39b018295312356404985cc67d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oscola-doc"

RDEPENDS:${PN} += ""

inherit rpm
