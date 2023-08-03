SUMMARY = "Documentation for texlive-metago"
DESCRIPTION = "This package includes the documentation for texlive-metago"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.9svn15878"

RPM_NAME = "texlive-metago-doc-2023.209.0.0.9svn15878-55.1.noarch.rpm"
RPM_HASH = "6178aad4ab76e8bb274f01acc135e3a8e52833807341208498664a365dff07da641e8903f4c7f305acc716a33d2b2975ea258aef453bf8a236accaf1fbbac8a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metago-doc"

RDEPENDS:${PN} += ""

inherit rpm
