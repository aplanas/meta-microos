SUMMARY = "Documentation for texlive-t-angles"
DESCRIPTION = "This package includes the documentation for texlive-t-angles"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-t-angles-doc-2023.209.svn15878-58.1.noarch.rpm"
RPM_HASH = "5f2d39758b6c3eafff882acb5d77af5e6af3bb13d0128646e7ca8595aecef5a4313fb8c594a62c88a4f38a16387fea01780c6a37f1a7ece90df1643c157dc64d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-t-angles-doc"

RDEPENDS:${PN} += ""

inherit rpm
