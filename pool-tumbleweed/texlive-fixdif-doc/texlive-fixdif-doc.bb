SUMMARY = "Documentation for texlive-fixdif"
DESCRIPTION = "This package includes the documentation for texlive-fixdif"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0bsvn66015"

RPM_NAME = "texlive-fixdif-doc-2023.209.2.0bsvn66015-53.1.noarch.rpm"
RPM_HASH = "1ef48c8d8e5164d51705a559460e9645defecfc52cb3466f866dafa5bd4abb5d51cd315abc1593f724768f4052d5cb03850fd0a667258a98939a7adb24ce5137"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-fixdif-doc-zh \
texlive-fixdif-doc"

RDEPENDS:${PN} += ""

inherit rpm
