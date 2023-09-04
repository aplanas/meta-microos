SUMMARY = "Documentation for texlive-wtref"
DESCRIPTION = "This package includes the documentation for texlive-wtref"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.4.0svn55558"

RPM_NAME = "texlive-wtref-doc-2023.209.0.0.4.0svn55558-53.2.noarch.rpm"
RPM_HASH = "99f17fd6b0be2e6dd04b51147371a526e9800770e9579086d130ceac905bc5e1e2b5f4f05cef5dd47e21860dfa75894285beccde57d5b3861dc18dcae8134903"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-wtref-doc-ja \
texlive-wtref-doc"

RDEPENDS:${PN} += ""

inherit rpm
