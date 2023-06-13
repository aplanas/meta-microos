SUMMARY = "Documentation for texlive-youngtab"
DESCRIPTION = "This package includes the documentation for texlive-youngtab"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn56500"

RPM_NAME = "texlive-youngtab-doc-2023.201.1.1svn56500-52.1.noarch.rpm"
RPM_HASH = "d778d13b6c47ab8fcf80dc06e0b756d4bed554874a78c10acbf0abee414db351705b1bae4997dc5d8d7063e1a3c33384e4065ee766f9fb70174ef0e13a186f25"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-youngtab-doc"

RDEPENDS:${PN} += "/bin/sh"

inherit rpm
