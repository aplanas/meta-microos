SUMMARY = "Documentation for texlive-pst-rputover"
DESCRIPTION = "This package includes the documentation for texlive-pst-rputover"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn44724"

RPM_NAME = "texlive-pst-rputover-doc-2023.209.1.0svn44724-54.2.noarch.rpm"
RPM_HASH = "d1ac4d138ecfc605e87638214050f1c7e65bbfad27a8f9475bf4d2cd625832556b0e1e033c3aa0e993bec4265560b74623cfa14974c3bd4fb9f0ad9b8fe13817"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pst-rputover-doc"

RDEPENDS:${PN} += ""

inherit rpm
