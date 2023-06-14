SUMMARY = "Documentation for texlive-na-box"
DESCRIPTION = "This package includes the documentation for texlive-na-box"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn45130"

RPM_NAME = "texlive-na-box-doc-2023.201.1.0svn45130-54.1.noarch.rpm"
RPM_HASH = "3f00f62e0285ef61123a11b67f8acfadeb1f63ea87071b3001dc41759caf0fac0031571df11fe7051d99611f194ece0329d93fbbd482133b2464e943ba154296"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-na-box-doc-ar \
texlive-na-box-doc"

RDEPENDS:${PN} += ""

inherit rpm
