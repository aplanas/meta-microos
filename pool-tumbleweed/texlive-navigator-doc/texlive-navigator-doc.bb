SUMMARY = "Documentation for texlive-navigator"
DESCRIPTION = "This package includes the documentation for texlive-navigator"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn41413"

RPM_NAME = "texlive-navigator-doc-2023.209.1.1svn41413-55.1.noarch.rpm"
RPM_HASH = "445c79471257581744cb2292a7643e911e21990be36a69d448ef088632792c1ec04a085f3e08ee25ab6eb2a70a8d1565b1ca451fc35329e8d8f6a336aa270484"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-navigator-doc"

RDEPENDS:${PN} += ""

inherit rpm
