SUMMARY = "Documentation for texlive-manuscript"
DESCRIPTION = "This package includes the documentation for texlive-manuscript"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.7svn36110"

RPM_NAME = "texlive-manuscript-doc-2023.201.1.7svn36110-52.1.noarch.rpm"
RPM_HASH = "9b7c8785e5a0a2f33e07e5deb9994062f5ca481cd75562bd5cf04a15ca963d1eb10d46cbabcb53978b39ffd476849c8190b1fa44cd47607ce33af692fde2df7b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-manuscript-doc"

RDEPENDS:${PN} += ""

inherit rpm
