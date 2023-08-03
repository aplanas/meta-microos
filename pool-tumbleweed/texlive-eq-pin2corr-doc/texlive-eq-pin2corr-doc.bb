SUMMARY = "Documentation for texlive-eq-pin2corr"
DESCRIPTION = "This package includes the documentation for texlive-eq-pin2corr"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn59477"

RPM_NAME = "texlive-eq-pin2corr-doc-2023.209.svn59477-54.1.noarch.rpm"
RPM_HASH = "0f6b977753fc37d52a03b6b85bb35e8768fabce2f0ac22c5c54c69af78d87d92f47d94c987418dfe85032a94e51fd435e2b8a0d65f10c82501da6841a3e30803"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eq-pin2corr-doc"

RDEPENDS:${PN} += ""

inherit rpm
