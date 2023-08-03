SUMMARY = "Documentation for texlive-otibet"
DESCRIPTION = "This package includes the documentation for texlive-otibet"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn45777"

RPM_NAME = "texlive-otibet-doc-2023.209.svn45777-55.1.noarch.rpm"
RPM_HASH = "dea84aac17aea1b30f023291bd4eb707e58d7d5334a52c1cf477f0f13d4865df5c439bda86aa4cf33a8771584d893d23658d35fb6e7f9326ce25e52b8281e61d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-otibet-doc"

RDEPENDS:${PN} += ""

inherit rpm
