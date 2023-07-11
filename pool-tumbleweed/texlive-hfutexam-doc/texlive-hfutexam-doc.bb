SUMMARY = "Documentation for texlive-hfutexam"
DESCRIPTION = "This package includes the documentation for texlive-hfutexam"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn66550"

RPM_NAME = "texlive-hfutexam-doc-2023.201.1.7svn66550-53.2.noarch.rpm"
RPM_HASH = "06e2adaa393ca89407c3ae776e26d741fc709630224b43bf7636b160d7804ed9843c983cbeb8c0b25bc7f24e8dbda91932606db77d90b35b412bf7b69e1d1e65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-hfutexam-doc"

RDEPENDS:${PN} += ""

inherit rpm
