SUMMARY = "Documentation for texlive-endnotes"
DESCRIPTION = "This package includes the documentation for texlive-endnotes"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn53319"

RPM_NAME = "texlive-endnotes-doc-2023.209.svn53319-54.1.noarch.rpm"
RPM_HASH = "2bc6595ec3ae4a7272b8b28c32eef50794979bc8f1905ee33e170e2127f74b30e9b564fca119048cf3480d4e90bf1346d1db54130dcfdeb539885a566cd80699"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-endnotes-doc"

RDEPENDS:${PN} += ""

inherit rpm
