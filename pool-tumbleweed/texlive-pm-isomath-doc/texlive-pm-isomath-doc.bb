SUMMARY = "Documentation for texlive-pm-isomath"
DESCRIPTION = "This package includes the documentation for texlive-pm-isomath"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.2.00svn60368"

RPM_NAME = "texlive-pm-isomath-doc-2023.209.1.2.00svn60368-53.1.noarch.rpm"
RPM_HASH = "288ba4d1a4685a64361749ca7e35f37c2ab20c77bc658c1e1bb5c18111d5b6212f29188e798ff63d74d3c57af9f722a5a6b01ddce080a677eb6b213462f353a1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pm-isomath-doc"

RDEPENDS:${PN} += ""

inherit rpm
