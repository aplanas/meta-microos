SUMMARY = "Documentation for texlive-environ"
DESCRIPTION = "This package includes the documentation for texlive-environ"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.3svn56615"

RPM_NAME = "texlive-environ-doc-2023.201.0.0.3svn56615-53.1.noarch.rpm"
RPM_HASH = "051c309bc65e7d2b51f023e36e481a0853c053c84093e172b33fe9ee5c8edd975bd47d2c1785a2e72a96d8d01849b6a6603d171b26ea21741879338da64cf916"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-environ-doc"

RDEPENDS:${PN} += ""

inherit rpm
