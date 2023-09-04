SUMMARY = "Documentation for texlive-pyluatex"
DESCRIPTION = "This package includes the documentation for texlive-pyluatex"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.6.1svn65855"

RPM_NAME = "texlive-pyluatex-doc-2023.209.0.0.6.1svn65855-54.2.noarch.rpm"
RPM_HASH = "460b03346790415fcb31477cf810918dfa20c762203511ef3e05318de8cbf4a8d71d8b4516905fae6eaa39bd0382bb6e3f7e789cb8f2c9033892ce5ed23b9454"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-pyluatex-doc"

RDEPENDS:${PN} += ""

inherit rpm
