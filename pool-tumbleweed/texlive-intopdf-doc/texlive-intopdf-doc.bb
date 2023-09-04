SUMMARY = "Documentation for texlive-intopdf"
DESCRIPTION = "This package includes the documentation for texlive-intopdf"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.1svn63987"

RPM_NAME = "texlive-intopdf-doc-2023.209.0.0.4.1svn63987-54.1.noarch.rpm"
RPM_HASH = "cb4adb09efe62841b5b342f834e3076b69664c9dc14b459565cf03218e17db0423d4bf1e47b41a730a83b605be2bd479ad51cac0ec0ce5777fb7b1750d149690"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-intopdf-doc"

RDEPENDS:${PN} += ""

inherit rpm
