SUMMARY = "Documentation for texlive-endheads"
DESCRIPTION = "This package includes the documentation for texlive-endheads"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn43750"

RPM_NAME = "texlive-endheads-doc-2023.209.1.6svn43750-54.2.noarch.rpm"
RPM_HASH = "7a450f1cf243a9e3762fa8bef9d22db9cb640e808c80247084130db56c6818c172de674f23e498e6a84b10fac7606c1f67a696c6dda120eca4bb0f5a8e2454d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endheads-doc"

RDEPENDS:${PN} += ""

inherit rpm
