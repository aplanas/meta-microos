SUMMARY = "Documentation for texlive-cals"
DESCRIPTION = "This package includes the documentation for texlive-cals"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.4.2svn43003"

RPM_NAME = "texlive-cals-doc-2023.209.2.4.2svn43003-53.1.noarch.rpm"
RPM_HASH = "d8b1bc8ba4d591dd5e42491e833ba687566713e76b369dc403473620d71ffe22cf16ffdd0a1a8e28591c95c37faad8f4637efb3abd8bfc03a6b2f4e2a649e39d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cals-doc"

RDEPENDS:${PN} += ""

inherit rpm
