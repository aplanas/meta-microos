SUMMARY = "Documentation for texlive-locality"
DESCRIPTION = "This package includes the documentation for texlive-locality"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.2svn20422"

RPM_NAME = "texlive-locality-doc-2023.209.0.0.2svn20422-55.1.noarch.rpm"
RPM_HASH = "7a2aed6c0b631b90cff4d55917942653ea7d4923d90c25e9e4db1beda13d8622981fbc62d260d621e0dae503e8006d35c10d9577f7f9fd5443aa102a7e7acffd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-locality-doc"

RDEPENDS:${PN} += ""

inherit rpm
