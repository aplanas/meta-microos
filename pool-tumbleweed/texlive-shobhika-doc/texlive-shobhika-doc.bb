SUMMARY = "Documentation for texlive-shobhika"
DESCRIPTION = "This package includes the documentation for texlive-shobhika"
LICENSE = "OFL-1.1"

PV = "2023.209.1.05svn50555"

RPM_NAME = "texlive-shobhika-doc-2023.209.1.05svn50555-54.1.noarch.rpm"
RPM_HASH = "f87a32a268c8a08db6a75b11bb2e2970508a3e7a53ef23e8b52c67bc466d8e245e521e1d026f2abf3625eae9202ee10f4f3637f679d70fea301fa949be0529a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-shobhika-doc"

RDEPENDS:${PN} += ""

inherit rpm
