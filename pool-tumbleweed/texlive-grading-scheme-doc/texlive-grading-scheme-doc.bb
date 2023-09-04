SUMMARY = "Documentation for texlive-grading-scheme"
DESCRIPTION = "This package includes the documentation for texlive-grading-scheme"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1.1svn62505"

RPM_NAME = "texlive-grading-scheme-doc-2023.209.0.0.1.1svn62505-54.2.noarch.rpm"
RPM_HASH = "a5e949d50989c9c4aad60a640374b4f80fe65d6b917493d3a04555df93406e3de904f31385bf45263eeefb43f72a1f0cef2a0d6c07d50bc6415a7a418389de12"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grading-scheme-doc"

RDEPENDS:${PN} += ""

inherit rpm
