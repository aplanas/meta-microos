SUMMARY = "Documentation for texlive-venturisadf"
DESCRIPTION = "This package includes the documentation for texlive-venturisadf"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.005svn19444"

RPM_NAME = "texlive-venturisadf-doc-2023.209.1.005svn19444-54.1.noarch.rpm"
RPM_HASH = "00353e1dff3816089381f582e7e11bb47caf855f3e53931f7a97aa4381d9438ec6e6c253a10090d2b6755f576ddd190d91af227b9f4df1adbb619e19f8547272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-venturisadf-doc"

RDEPENDS:${PN} += ""

inherit rpm
