SUMMARY = "Documentation for texlive-elvish"
DESCRIPTION = "This package includes the documentation for texlive-elvish"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn15878"

RPM_NAME = "texlive-elvish-doc-2023.201.svn15878-53.2.noarch.rpm"
RPM_HASH = "a6a3987ea879889ac9c524fd1ff40736ac852f7896e43f9c773c2bfa97e0dd5b3b1806761957511bdf3e54a50bed370b2b908029edbaf32f72a34c39fe5455fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-elvish-doc"

RDEPENDS:${PN} += ""

inherit rpm
