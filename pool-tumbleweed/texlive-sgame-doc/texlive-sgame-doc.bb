SUMMARY = "Documentation for texlive-sgame"
DESCRIPTION = "This package includes the documentation for texlive-sgame"
LICENSE = "LPPL-1.0"

PV = "2023.201.2.15svn30959"

RPM_NAME = "texlive-sgame-doc-2023.201.2.15svn30959-53.1.noarch.rpm"
RPM_HASH = "f579469b4f6ad852353a0c2b5b207ce366b0d76ae95008f5f3e23d954574a6a5247b2dc6d8a317cc8e661ccf0f4d7a8835503ee2bce8a4863c8ef747644fd413"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sgame-doc"

RDEPENDS:${PN} += ""

inherit rpm
