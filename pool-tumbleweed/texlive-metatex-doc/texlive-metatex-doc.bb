SUMMARY = "Documentation for texlive-metatex"
DESCRIPTION = "This package includes the documentation for texlive-metatex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.1.1svn15878"

RPM_NAME = "texlive-metatex-doc-2023.201.1.1svn15878-54.1.noarch.rpm"
RPM_HASH = "b2e936c72658ea6cdbea1578e86c530aa73396e259fcacfcdbbfa0b6c644d5d1a3d679c1096fc57594d58fcd07db7534c3c4ccc5ae627a8d4c4f46673d4b9420"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-metatex-doc"
RDEPENDS:${PN} += ""

inherit rpm
