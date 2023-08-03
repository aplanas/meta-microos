SUMMARY = "Documentation for texlive-showtags"
DESCRIPTION = "This package includes the documentation for texlive-showtags"
LICENSE = "SUSE-Public-Domain"

PV = "2023.209.1.05svn20336"

RPM_NAME = "texlive-showtags-doc-2023.209.1.05svn20336-54.1.noarch.rpm"
RPM_HASH = "cc5c7bfa9de91758fe285080d9a5946925131097d147f639c84ac0d5dd2ceaaf4b5908ab66235043c11e8e9e2b8c3e81eb4ae71072516e120f9309d5148e6ffc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-showtags-doc"

RDEPENDS:${PN} += ""

inherit rpm
