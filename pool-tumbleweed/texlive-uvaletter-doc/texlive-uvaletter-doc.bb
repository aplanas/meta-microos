SUMMARY = "Documentation for texlive-uvaletter"
DESCRIPTION = "This package includes the documentation for texlive-uvaletter"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn66330"

RPM_NAME = "texlive-uvaletter-doc-2023.209.1.1.0svn66330-54.1.noarch.rpm"
RPM_HASH = "e2003b85b1c11f0a4ecec995b1db1fcdf19c48466bf9aa987645f8178d8ebe99057d102e810e2bb5c9922a52b2eaa51e0371f3e1ba8927de3b14430506f059cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-uvaletter-doc"

RDEPENDS:${PN} += ""

inherit rpm
