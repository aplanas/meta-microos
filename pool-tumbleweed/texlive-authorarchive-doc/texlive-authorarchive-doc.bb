SUMMARY = "Documentation for texlive-authorarchive"
DESCRIPTION = "This package includes the documentation for texlive-authorarchive"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3.0svn65777"

RPM_NAME = "texlive-authorarchive-doc-2023.209.1.3.0svn65777-54.1.noarch.rpm"
RPM_HASH = "38a0b74c8af89916b5ada256485078a0a2b327bf4c091c0f380288c4716110e14b0edfbc0cc4693e90f145a30f79b8ffb58a1d465b75f1553f3b8f5a90be2211"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-authorarchive-doc"

RDEPENDS:${PN} += ""

inherit rpm
