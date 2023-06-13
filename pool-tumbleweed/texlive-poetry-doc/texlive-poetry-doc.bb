SUMMARY = "Documentation for texlive-poetry"
DESCRIPTION = "This package includes the documentation for texlive-poetry"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.2svn53129"

RPM_NAME = "texlive-poetry-doc-2023.201.2.2svn53129-52.1.noarch.rpm"
RPM_HASH = "7e600b3773ab058fd7a287206532205e6dfa1c638fd8b62a904c1587549e78930df91d47077645fe13d169cd0989a17898ec290ee403edc42edd670a6dfe29fb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-poetry-doc"

RDEPENDS:${PN} += ""

inherit rpm
