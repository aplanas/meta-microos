SUMMARY = "Documentation for texlive-xint"
DESCRIPTION = "This package includes the documentation for texlive-xint"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4msvn63562"

RPM_NAME = "texlive-xint-doc-2023.209.1.4msvn63562-53.2.noarch.rpm"
RPM_HASH = "601350dfc5efce51151116e8220588a68b9f1e8eda5fea3167831faf076b9f0555c4f58397c7dd7e0074be4e35d4b4330ddccbe3d615f2f64537514d75769c4e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xint-doc"

RDEPENDS:${PN} += ""

inherit rpm
