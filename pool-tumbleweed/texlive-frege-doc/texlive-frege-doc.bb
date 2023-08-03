SUMMARY = "Documentation for texlive-frege"
DESCRIPTION = "This package includes the documentation for texlive-frege"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.1.3svn27417"

RPM_NAME = "texlive-frege-doc-2023.209.1.3svn27417-53.1.noarch.rpm"
RPM_HASH = "d1a0395cbfdef63a6caece7d5b70dacddfb147594b1729e620e075e7b48145d6ad6facb8bdff322fca12874362f26610fe42dc4c81852c43264d6f82e2401d5c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-frege-doc"

RDEPENDS:${PN} += ""

inherit rpm
