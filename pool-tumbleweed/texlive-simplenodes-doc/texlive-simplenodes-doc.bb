SUMMARY = "Documentation for texlive-simplenodes"
DESCRIPTION = "This package includes the documentation for texlive-simplenodes"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn62888"

RPM_NAME = "texlive-simplenodes-doc-2023.201.svn62888-53.1.noarch.rpm"
RPM_HASH = "ff9703826384202f8484a6097e8dcbf2366be371ad13e0305e6fe31150c8911292e5c090069220679e90035b168dcf646e52c79ba3086275c5fac05548fa2b14"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-simplenodes-doc"

RDEPENDS:${PN} += ""

inherit rpm
