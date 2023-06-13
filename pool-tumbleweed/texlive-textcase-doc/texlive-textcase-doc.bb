SUMMARY = "Documentation for texlive-textcase"
DESCRIPTION = "This package includes the documentation for texlive-textcase"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.03svn63868"

RPM_NAME = "texlive-textcase-doc-2023.201.1.03svn63868-54.1.noarch.rpm"
RPM_HASH = "f6492799cc4ed1d421e4f5e2d0d5ffca754c19a7a84323bd839015144ae93b5bb65c9c977edb8bd849dca11680e95c89feb38d14e24bc87f70fadbe4ecac516a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-textcase-doc"

RDEPENDS:${PN} += ""

inherit rpm
