SUMMARY = "Documentation for texlive-bropd"
DESCRIPTION = "This package includes the documentation for texlive-bropd"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.2svn35383"

RPM_NAME = "texlive-bropd-doc-2023.201.1.2svn35383-52.1.noarch.rpm"
RPM_HASH = "1cfaa2f68515731eab2ae09cd7f7d774d48d6abecc7612ef633af325b320004bd5b56e0df5e4904eae83fe5e3854a27f104f0b91e37993f1db6e6c45ed35490c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bropd-doc"

RDEPENDS:${PN} += ""

inherit rpm
