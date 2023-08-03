SUMMARY = "Documentation for texlive-pdfjam"
DESCRIPTION = "This package includes the documentation for texlive-pdfjam"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.3.03svn56991"

RPM_NAME = "texlive-pdfjam-doc-2023.209.3.03svn56991-52.1.noarch.rpm"
RPM_HASH = "5f02a5e4fdc077d561a3c52dfed16d29593045b08a6ed9b8730199a36ce4651a4e26f5d5c901c9a22dd3fb87f70a846d4467c4753c911b863d019c67f0070951"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "man-pdfjam.1 \
texlive-pdfjam-doc"

RDEPENDS:${PN} += ""

inherit rpm
