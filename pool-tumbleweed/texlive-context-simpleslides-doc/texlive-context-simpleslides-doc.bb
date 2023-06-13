SUMMARY = "Documentation for texlive-context-simpleslides"
DESCRIPTION = "This package includes the documentation for texlive-context-simpleslides"
LICENSE = "GPL-2.0-or-later"

PV = "2023.204.svn63903"

RPM_NAME = "texlive-context-simpleslides-doc-2023.204.svn63903-54.1.noarch.rpm"
RPM_HASH = "2f40afafd1053612a6a9736ac3372c7d4121bd14e0dc17f6bc9bd4f2bd9cb0d592fc7e243b579d759756df1ac7db1a4467d4bf3ea0c61da649917d02cb081355"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-context-simpleslides-doc"

RDEPENDS:${PN} += ""

inherit rpm
