SUMMARY = "Documentation for texlive-debate"
DESCRIPTION = "This package includes the documentation for texlive-debate"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.2.1svn64846"

RPM_NAME = "texlive-debate-doc-2023.201.0.0.2.1svn64846-52.1.noarch.rpm"
RPM_HASH = "d9c05e1b5dd594d57168b054e5ac693d488ccea6e775f09ec67a2d247e3a98ef10d0cc01f00fabbec2eb5ebd0bdefe13458bb44185207d8312b04557efd7d623"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-debate-doc"

RDEPENDS:${PN} += ""

inherit rpm
