SUMMARY = "Documentation for texlive-fiziko"
DESCRIPTION = "This package includes the documentation for texlive-fiziko"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.0.0.2.0svn61944"

RPM_NAME = "texlive-fiziko-doc-2023.209.0.0.2.0svn61944-53.1.noarch.rpm"
RPM_HASH = "cfc4c4ddaf2e779d4b330f7f4a4f2b7079f537276138d27a58afd5a8b76a6eac2aca40282d50331d0fccea2083bef5f114d3f3e6705af790f638eae4ce2a3f48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fiziko-doc"

RDEPENDS:${PN} += ""

inherit rpm
