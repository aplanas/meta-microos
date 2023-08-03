SUMMARY = "Documentation for texlive-susy"
DESCRIPTION = "This package includes the documentation for texlive-susy"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn19440"

RPM_NAME = "texlive-susy-doc-2023.209.svn19440-58.1.noarch.rpm"
RPM_HASH = "351fbc7ce7d803deb3d4275b8cb7e9405f67788d04fbec505a5ac31927b774a461ea1f41158b8d54fa8f758683ed7204fe4590bad7ad84737c61fa26387b15f8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-susy-doc"

RDEPENDS:${PN} += ""

inherit rpm
