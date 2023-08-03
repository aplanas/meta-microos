SUMMARY = "Documentation for texlive-calculator"
DESCRIPTION = "This package includes the documentation for texlive-calculator"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.1svn64424"

RPM_NAME = "texlive-calculator-doc-2023.209.2.1svn64424-53.1.noarch.rpm"
RPM_HASH = "f3aacccdf218abd6e3f16af46dd3db88347cf3b8d38d18f4c3af49a55f333e7603593cf82dfcf1736f95070c1f1f82447d2be21f438d2dc1ae7080d2ea5527d6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-calculator-doc"

RDEPENDS:${PN} += ""

inherit rpm
