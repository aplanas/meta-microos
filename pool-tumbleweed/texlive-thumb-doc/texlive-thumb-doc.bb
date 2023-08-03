SUMMARY = "Documentation for texlive-thumb"
DESCRIPTION = "This package includes the documentation for texlive-thumb"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.0svn16549"

RPM_NAME = "texlive-thumb-doc-2023.209.1.0svn16549-55.1.noarch.rpm"
RPM_HASH = "daafb687cf54a733627b09697cd0f97981a6e88301dd40f27e28c8e611ce77fc82a30fe45e3c9da551025b1085e777186e0127bc138ba63f1de31e73df87425f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-thumb-doc"

RDEPENDS:${PN} += ""

inherit rpm
