SUMMARY = "Documentation for texlive-xskak"
DESCRIPTION = "This package includes the documentation for texlive-xskak"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.5svn51432"

RPM_NAME = "texlive-xskak-doc-2023.201.1.5svn51432-52.1.noarch.rpm"
RPM_HASH = "abcbd257f51c0701bdf2bb5d1f1e2bbb03424c492565396aa75a6e5f46b2d198cb43adecdb73ddf995abfadcfabd59c1743a709783bc58c18ca522dc6f5adc54"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xskak-doc"

RDEPENDS:${PN} += ""

inherit rpm
