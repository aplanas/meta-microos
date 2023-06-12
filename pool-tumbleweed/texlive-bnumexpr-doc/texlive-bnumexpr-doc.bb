SUMMARY = "Documentation for texlive-bnumexpr"
DESCRIPTION = "This package includes the documentation for texlive-bnumexpr"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn59244"

RPM_NAME = "texlive-bnumexpr-doc-2023.201.1.5svn59244-52.1.noarch.rpm"
RPM_HASH = "d3973b24e9db36500dfd59400834b7d9cbffad8bafbf41c0828bb98a9935e341a0bc48ca79c3c8ebe4d5f2a64d50196458778a2531f19a2af8df89d04c6fd0fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bnumexpr-doc"
RDEPENDS:${PN} += ""

inherit rpm
