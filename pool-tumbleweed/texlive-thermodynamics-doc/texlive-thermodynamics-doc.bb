SUMMARY = "Documentation for texlive-thermodynamics"
DESCRIPTION = "This package includes the documentation for texlive-thermodynamics"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.00svn63188"

RPM_NAME = "texlive-thermodynamics-doc-2023.209.1.00svn63188-55.1.noarch.rpm"
RPM_HASH = "30d40b3e352bb005a0a862e0e676d7367fa86383fe92ea1d913f558be8444cbe9f907d0f4d25be75663e19dd8a2d4fffad27ed83e027f61e179415f169d6dbbc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thermodynamics-doc"

RDEPENDS:${PN} += ""

inherit rpm
