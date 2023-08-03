SUMMARY = "Documentation for texlive-umbclegislation"
DESCRIPTION = "This package includes the documentation for texlive-umbclegislation"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2016_6_8svn41348"

RPM_NAME = "texlive-umbclegislation-doc-2023.209.2016_6_8svn41348-54.1.noarch.rpm"
RPM_HASH = "a3b3bddc584e37686342e653a7165480353b47d0ef19a1ca057fb51326807393711c38a9e9ff25b6e1e84a77ba098f1a0b60a0c492de8876900d7c90ceac248f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-umbclegislation-doc"

RDEPENDS:${PN} += ""

inherit rpm
