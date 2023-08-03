SUMMARY = "Documentation for texlive-seqsplit"
DESCRIPTION = "This package includes the documentation for texlive-seqsplit"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.1svn15878"

RPM_NAME = "texlive-seqsplit-doc-2023.209.0.0.1svn15878-54.1.noarch.rpm"
RPM_HASH = "92fe2f714fe51b0ee07503d66a140530e3080095d222d161da8b9a2c71c72a2a8e38f595511b5a7f47ae7f668b8efb57213b87114641c4bfe1215b2871d05438"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-seqsplit-doc"

RDEPENDS:${PN} += ""

inherit rpm
