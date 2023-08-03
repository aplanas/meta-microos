SUMMARY = "Documentation for texlive-textcase"
DESCRIPTION = "This package includes the documentation for texlive-textcase"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.03svn63868"

RPM_NAME = "texlive-textcase-doc-2023.209.1.03svn63868-55.1.noarch.rpm"
RPM_HASH = "245413a9d193d427a6fa323125571a488e3fd3ec86113ec8170d93d1f873633f0a4ae03f91cb95744fa0c2b000d1ccf99197f789afd434495aef28e427f7467f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textcase-doc"

RDEPENDS:${PN} += ""

inherit rpm
