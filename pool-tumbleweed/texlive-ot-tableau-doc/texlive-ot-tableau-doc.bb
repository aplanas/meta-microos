SUMMARY = "Documentation for texlive-ot-tableau"
DESCRIPTION = "This package includes the documentation for texlive-ot-tableau"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn59318"

RPM_NAME = "texlive-ot-tableau-doc-2023.209.svn59318-55.1.noarch.rpm"
RPM_HASH = "b95a2e9989ae2fd5d867680d86597e2ce7edf1d78bff157b68ebad5895062afe64635c5832a81d7efb2690014ebef8f62907d295db7adb74db87f84780243ee3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ot-tableau-doc"

RDEPENDS:${PN} += ""

inherit rpm
