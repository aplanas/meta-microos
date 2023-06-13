SUMMARY = "Documentation for texlive-fiziko"
DESCRIPTION = "This package includes the documentation for texlive-fiziko"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.0.0.2.0svn61944"

RPM_NAME = "texlive-fiziko-doc-2023.201.0.0.2.0svn61944-52.1.noarch.rpm"
RPM_HASH = "20ff63d57edb484a295546a482138e75d3c0baa9ca31d566e9f55ae255fe126e4b35924ab3f0e768a99949295beb745ee89d7534d26080417b2a678bfa1ee2e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fiziko-doc"

RDEPENDS:${PN} += ""

inherit rpm
