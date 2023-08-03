SUMMARY = "Documentation for texlive-xgreek"
DESCRIPTION = "This package includes the documentation for texlive-xgreek"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.2.0svn64300"

RPM_NAME = "texlive-xgreek-doc-2023.209.3.2.0svn64300-53.1.noarch.rpm"
RPM_HASH = "8e471d8a9895379416dcf453729d7e9d0262e44ee90e24c420eb6f6933aa757dc9398c6e3606d2f36cc820de57b67a90751ca481842a170f7f1f40bbf5223e95"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xgreek-doc"

RDEPENDS:${PN} += ""

inherit rpm
