SUMMARY = "Documentation for texlive-mathpazo"
DESCRIPTION = "This package includes the documentation for texlive-mathpazo"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.003svn52663"

RPM_NAME = "texlive-mathpazo-doc-2023.201.1.003svn52663-52.1.noarch.rpm"
RPM_HASH = "993ccc70b8f889aa6194e4fadf6cdb6f6d3a93755e2e96dbb0182aa3ee25f77512093576242a096f66545b2b8ba28cb75b2e9a594b6ca315b84bb92147e45001"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathpazo-doc"

RDEPENDS:${PN} += ""

inherit rpm
