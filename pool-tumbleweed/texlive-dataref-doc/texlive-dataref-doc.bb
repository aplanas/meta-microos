SUMMARY = "Documentation for texlive-dataref"
DESCRIPTION = "This package includes the documentation for texlive-dataref"
LICENSE = "LPPL-1.0"

PV = "2023.204.0.0.7svn62942"

RPM_NAME = "texlive-dataref-doc-2023.204.0.0.7svn62942-54.1.noarch.rpm"
RPM_HASH = "75d9884ff5729db76a24ddcebd8a3499dd635b67331488c9657e269f095648495645951006240cbafcb44c7249266a7f702bafba02157d93bceb9f905417c8c4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dataref-doc"

RDEPENDS:${PN} += ""

inherit rpm
