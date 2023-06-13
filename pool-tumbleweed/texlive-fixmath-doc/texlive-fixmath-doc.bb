SUMMARY = "Documentation for texlive-fixmath"
DESCRIPTION = "This package includes the documentation for texlive-fixmath"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.9.1svn64648"

RPM_NAME = "texlive-fixmath-doc-2023.201.0.0.9.1svn64648-52.1.noarch.rpm"
RPM_HASH = "1923efc5e40cc35523a35dc3c36f0e46a7426d246c0eb7bb35cd092778a2c1d9a2e14d2bacc5e7c984450e2b6b26bbd03ede7177c34ba915a86071904ac8fc94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-fixmath-doc"

RDEPENDS:${PN} += ""

inherit rpm
