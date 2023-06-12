SUMMARY = "Documentation for texlive-quran-bn"
DESCRIPTION = "This package includes the documentation for texlive-quran-bn"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.1svn57602"

RPM_NAME = "texlive-quran-bn-doc-2023.201.0.0.1svn57602-53.1.noarch.rpm"
RPM_HASH = "feafe5cd6ebca22c8e856693315b35e5e932445b3fd77fd011ad641fe1344f2697904a9f93b9a85c90afa8d800acd14f0fbe62cfacc3399b45d4fd0b0b767ac2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quran-bn-doc"
RDEPENDS:${PN} += ""

inherit rpm
