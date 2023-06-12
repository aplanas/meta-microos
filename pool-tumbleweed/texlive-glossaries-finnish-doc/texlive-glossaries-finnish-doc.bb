SUMMARY = "Documentation for texlive-glossaries-finnish"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-finnish"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn54080"

RPM_NAME = "texlive-glossaries-finnish-doc-2023.201.1.0svn54080-53.1.noarch.rpm"
RPM_HASH = "9a5545d9f0fc7268fa237ba23883c4c398318133b04e977bcc792a783641e86dd743dd0c47a2e64a77436f677faf500d23ab958284769c2f876324162ec0f4d5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-finnish-doc"
RDEPENDS:${PN} += ""

inherit rpm
