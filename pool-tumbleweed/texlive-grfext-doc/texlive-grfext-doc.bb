SUMMARY = "Documentation for texlive-grfext"
DESCRIPTION = "This package includes the documentation for texlive-grfext"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn53024"

RPM_NAME = "texlive-grfext-doc-2023.209.1.3svn53024-54.2.noarch.rpm"
RPM_HASH = "32125c98fca3c1c89b296a28abedb704dcd016d9eafefce037417d3e3cef8dd8ae8867d5001f4c69892bc278f96648651c0797555a016c278ac636f6f73c9833"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-grfext-doc"

RDEPENDS:${PN} += ""

inherit rpm
