SUMMARY = "Documentation for texlive-velthuis"
DESCRIPTION = "This package includes the documentation for texlive-velthuis"
LICENSE = "GPL-2.0-or-later"

PV = "2023.201.2.17.1svn66186"

RPM_NAME = "texlive-velthuis-doc-2023.201.2.17.1svn66186-53.1.noarch.rpm"
RPM_HASH = "6623abad5d563401d9c90f56a376127480325eb407112ab1820aaf166a72e4351a50190e08f535240d76e6f4d83a41a8fc9799ea063dc264699294335e91d1a4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man(devnag.1) \
texlive-velthuis-doc"

RDEPENDS:${PN} += ""

inherit rpm
