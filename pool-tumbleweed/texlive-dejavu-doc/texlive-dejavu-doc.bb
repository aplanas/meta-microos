SUMMARY = "Documentation for texlive-dejavu"
DESCRIPTION = "This package includes the documentation for texlive-dejavu"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.34svn31771"

RPM_NAME = "texlive-dejavu-doc-2023.209.2.34svn31771-53.1.noarch.rpm"
RPM_HASH = "05b0b097fe0fa6dae35bfc86999ba76a9786b6cd1903fd852feb70431892852fe9519f1af73590fd70dd15ffd1df4a38758e67ebbe5d9f394206b8a32bffaa49"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-dejavu-doc"

RDEPENDS:${PN} += ""

inherit rpm
