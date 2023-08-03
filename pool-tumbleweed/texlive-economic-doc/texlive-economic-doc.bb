SUMMARY = "Documentation for texlive-economic"
DESCRIPTION = "This package includes the documentation for texlive-economic"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn32639"

RPM_NAME = "texlive-economic-doc-2023.209.svn32639-54.1.noarch.rpm"
RPM_HASH = "c1829c4c5435e0e92dda6fac46d2934e2e533bca6c2600c8781e414320bc8a3743f1e3c3e3fd5a7e11b36b2619a1a5d4d792bbcd65276e771d720b873518aa23"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-economic-doc"

RDEPENDS:${PN} += ""

inherit rpm
