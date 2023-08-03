SUMMARY = "Documentation for texlive-kinematikz"
DESCRIPTION = "This package includes the documentation for texlive-kinematikz"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn61392"

RPM_NAME = "texlive-kinematikz-doc-2023.209.1.0svn61392-56.1.noarch.rpm"
RPM_HASH = "180ed495a541e584d69766c3b6bb0698cadda84e97a5fda1d22e75f2ef5f883329532852548b5b112028f14d9331bcacaa5858e4469769fccb67d4b9f5167e83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-kinematikz-doc"

RDEPENDS:${PN} += ""

inherit rpm
