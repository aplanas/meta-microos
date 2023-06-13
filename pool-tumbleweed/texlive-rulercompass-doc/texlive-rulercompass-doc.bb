SUMMARY = "Documentation for texlive-rulercompass"
DESCRIPTION = "This package includes the documentation for texlive-rulercompass"
LICENSE = "LPPL-1.0"

PV = "2023.201.1svn32392"

RPM_NAME = "texlive-rulercompass-doc-2023.201.1svn32392-53.1.noarch.rpm"
RPM_HASH = "0139ea2b467acc0b0131c26d74cf0145f5bf7f889f0240afbc867a5d8878a15983511a720bcaf9122e3cd1b70d7881181f4d37553d17de3f6f8dfd901df4c8cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-rulercompass-doc"

RDEPENDS:${PN} += ""

inherit rpm
