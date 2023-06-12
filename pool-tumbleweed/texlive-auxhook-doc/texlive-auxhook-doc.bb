SUMMARY = "Documentation for texlive-auxhook"
DESCRIPTION = "This package includes the documentation for texlive-auxhook"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.6svn53173"

RPM_NAME = "texlive-auxhook-doc-2023.201.1.6svn53173-53.1.noarch.rpm"
RPM_HASH = "2f41f44e91b7f41c0c79617a8550d54215fe380d64a40eba1fa205d1c79a12bfc587ea1c989e788a841109df2041d6604d06d3b5656759adec63bff1f66bf1ad"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-auxhook-doc"
RDEPENDS:${PN} += ""

inherit rpm
