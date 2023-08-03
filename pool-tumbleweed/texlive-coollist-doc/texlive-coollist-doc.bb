SUMMARY = "Documentation for texlive-coollist"
DESCRIPTION = "This package includes the documentation for texlive-coollist"
LICENSE = "LGPL-2.1-or-later"

PV = "2023.209.1.4svn63523"

RPM_NAME = "texlive-coollist-doc-2023.209.1.4svn63523-55.1.noarch.rpm"
RPM_HASH = "c1b0afc64e9349aba0d3923ea70e970f758d301c4a46b05b10d35f594aa5886521b0ebce6297631253cac04bb542d4be1aa1f68883280e2dd2af5245eb4fddbd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-coollist-doc"

RDEPENDS:${PN} += ""

inherit rpm
