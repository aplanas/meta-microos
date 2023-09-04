SUMMARY = "Documentation for texlive-xcolor"
DESCRIPTION = "This package includes the documentation for texlive-xcolor"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.14svn63563"

RPM_NAME = "texlive-xcolor-doc-2023.209.2.14svn63563-53.2.noarch.rpm"
RPM_HASH = "3e6e047a26dca6b5842a023daf80a5d5c57967aeb9248b21a8cb0dc6ae8938fba6ae08cff2297a4f6a41c604ac4131e35e18bb12ef584419288be6e60d1cf53e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xcolor-doc"

RDEPENDS:${PN} += ""

inherit rpm
