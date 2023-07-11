SUMMARY = "Documentation for texlive-mathpartir"
DESCRIPTION = "This package includes the documentation for texlive-mathpartir"
LICENSE = "GPL-2.0-or-later"

PV = "2023.208.1.3.2svn39864"

RPM_NAME = "texlive-mathpartir-doc-2023.208.1.3.2svn39864-53.1.noarch.rpm"
RPM_HASH = "a8584eef9ce5041b0e7bf78b80f81259b4eb309b95464b8680cf5160afb33a689cd5ba0c2f368161f2ba9dd25f72cbaa12156c225c415be07e15b11dc80d9b5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-mathpartir-doc"

RDEPENDS:${PN} += ""

inherit rpm
