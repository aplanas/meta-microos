SUMMARY = "Documentation for texlive-biblatex-lni"
DESCRIPTION = "This package includes the documentation for texlive-biblatex-lni"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.5svn61719"

RPM_NAME = "texlive-biblatex-lni-doc-2023.201.0.0.5svn61719-53.1.noarch.rpm"
RPM_HASH = "59de383ca5fed6d6fe54184e1bb2e1ae47362dddf044274c35f63910abc616b90845c80a22026c48c39914f43ef689aef6c2db85a931d120d6c19fa0b7bfa6c9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-biblatex-lni-doc"

RDEPENDS:${PN} += ""

inherit rpm
