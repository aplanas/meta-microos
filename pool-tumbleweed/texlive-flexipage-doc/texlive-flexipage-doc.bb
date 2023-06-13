SUMMARY = "Documentation for texlive-flexipage"
DESCRIPTION = "This package includes the documentation for texlive-flexipage"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.01svn64572"

RPM_NAME = "texlive-flexipage-doc-2023.201.1.01svn64572-52.1.noarch.rpm"
RPM_HASH = "dc7414c5dd52c93add636330f781d87540e5df86402fa728a1fcf584773fe4d4b7570907187bc46bc04cb7e9db3565d7328f95e0448556b88a1208f0ee6588e4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-flexipage-doc"

RDEPENDS:${PN} += ""

inherit rpm
