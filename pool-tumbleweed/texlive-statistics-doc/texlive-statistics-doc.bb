SUMMARY = "Documentation for texlive-statistics"
DESCRIPTION = "This package includes the documentation for texlive-statistics"
LICENSE = "GPL-2.0-or-later"

PV = "2023.209.2.2svn52212"

RPM_NAME = "texlive-statistics-doc-2023.209.2.2svn52212-58.1.noarch.rpm"
RPM_HASH = "b6066f483b2a1f9db110600ff9bce1a1e33c166a461326222b029968c33efc22f26c52f6c076f2f6622666cb11420bd0a82c67c24ea9807b3cb841dac0d92906"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-statistics-doc"

RDEPENDS:${PN} += ""

inherit rpm
