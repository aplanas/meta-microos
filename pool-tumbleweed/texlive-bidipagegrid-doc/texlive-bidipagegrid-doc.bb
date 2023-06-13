SUMMARY = "Documentation for texlive-bidipagegrid"
DESCRIPTION = "This package includes the documentation for texlive-bidipagegrid"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2svn34632"

RPM_NAME = "texlive-bidipagegrid-doc-2023.201.0.0.2svn34632-53.1.noarch.rpm"
RPM_HASH = "4bb3ae240709f039b303e40c4f6600f6dc20866bf0689357857dbfd84dbd91ee57e994072ffc1a11f406dbcc29e91143da1bc49c7ee21f0269e3cb555587160d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bidipagegrid-doc"

RDEPENDS:${PN} += ""

inherit rpm
