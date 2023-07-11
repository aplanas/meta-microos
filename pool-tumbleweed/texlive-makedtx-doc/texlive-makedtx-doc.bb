SUMMARY = "Documentation for texlive-makedtx"
DESCRIPTION = "This package includes the documentation for texlive-makedtx"
LICENSE = "LPPL-1.0"

PV = "2023.208.1.2svn46702"

RPM_NAME = "texlive-makedtx-doc-2023.208.1.2svn46702-53.1.noarch.rpm"
RPM_HASH = "54e849afba11bc3a49dc47fce2bcd3c77016cbac6bce69be23ea06449fb3da605bb95a073baf5a85c502edd2e9e01be0fede77e37237b8572c740d173c49f3f9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-makedtx-doc"

RDEPENDS:${PN} += ""

inherit rpm
