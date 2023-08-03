SUMMARY = "Documentation for texlive-scrambledenvs"
DESCRIPTION = "This package includes the documentation for texlive-scrambledenvs"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1.0svn60615"

RPM_NAME = "texlive-scrambledenvs-doc-2023.209.1.1.0svn60615-54.1.noarch.rpm"
RPM_HASH = "d7449be181769a85e7d1a68188a19bb37817066baab80b0fcb1e8fbf38303ebd38e5ef2958bc702aa87205dccb51efab35916806ab6cf083469ce2962c857f55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-scrambledenvs-doc"

RDEPENDS:${PN} += ""

inherit rpm
