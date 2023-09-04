SUMMARY = "Documentation for texlive-pxbase"
DESCRIPTION = "This package includes the documentation for texlive-pxbase"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn66187"

RPM_NAME = "texlive-pxbase-doc-2023.209.1.4svn66187-54.2.noarch.rpm"
RPM_HASH = "9a5e5cf62a4a870e35124dc52416032565b161f577af3be7c67c5dbd245711706dd1fb9f1cf98094d749adfc9458973ac31821490d05dff5d5ba36fe7bfede0a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-pxbase-doc-ja \
texlive-pxbase-doc"

RDEPENDS:${PN} += ""

inherit rpm
