SUMMARY = "Documentation for texlive-comfortaa"
DESCRIPTION = "This package includes the documentation for texlive-comfortaa"
LICENSE = "OFL-1.1"

PV = "2023.209.3.2svn54512"

RPM_NAME = "texlive-comfortaa-doc-2023.209.3.2svn54512-54.1.noarch.rpm"
RPM_HASH = "46874694b48304ff8b0ea070d8b01e1ce40b86fbaa3809bc266984e57f7bc2e3bc644f5340dcae54e78ed862dc205837735a5ce49a4b70f9c6f7f37b5a514137"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-comfortaa-doc"

RDEPENDS:${PN} += ""

inherit rpm
