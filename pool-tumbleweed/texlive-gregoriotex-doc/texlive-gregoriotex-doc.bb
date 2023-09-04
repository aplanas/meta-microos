SUMMARY = "Documentation for texlive-gregoriotex"
DESCRIPTION = "This package includes the documentation for texlive-gregoriotex"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.6.0.0svn58331"

RPM_NAME = "texlive-gregoriotex-doc-2023.209.6.0.0svn58331-54.2.noarch.rpm"
RPM_HASH = "cf9ece175aaf956384103df9ad5f958a1bc03ca123071ca730c75471acc5953eaa82a410600877ed25bc77f6ac70058c991e8e9f0c615869b5591924fbda55b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-gregoriotex-doc"

RDEPENDS:${PN} += ""

inherit rpm
