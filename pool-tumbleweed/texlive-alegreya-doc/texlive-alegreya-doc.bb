SUMMARY = "Documentation for texlive-alegreya"
DESCRIPTION = "This package includes the documentation for texlive-alegreya"
LICENSE = "OFL-1.1"

PV = "2023.209.svn64384"

RPM_NAME = "texlive-alegreya-doc-2023.209.svn64384-55.1.noarch.rpm"
RPM_HASH = "afe4bcfb7c1a3d670354510423bfb859a06dccba8a981a95ea184001011de3f854b14c1be3c4e835880a5f93d7ddeaa94e50f39c1ad484f28309f761f672078a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-alegreya-doc"

RDEPENDS:${PN} += ""

inherit rpm
