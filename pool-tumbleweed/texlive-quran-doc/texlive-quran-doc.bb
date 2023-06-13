SUMMARY = "Documentation for texlive-quran"
DESCRIPTION = "This package includes the documentation for texlive-quran"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.81svn57601"

RPM_NAME = "texlive-quran-doc-2023.201.1.81svn57601-53.1.noarch.rpm"
RPM_HASH = "fb1dfbac8c4ee7b5df135a093397e035577f46ddec8c15f7207547dc8aa4ebfde6430de5e4d94cfed191d11af3a194c2bec6d5981b0f5fc5ed2aebedf8f61dbf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-quran-doc"

RDEPENDS:${PN} += ""

inherit rpm
