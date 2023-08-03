SUMMARY = "Documentation for texlive-urwchancal"
DESCRIPTION = "This package includes the documentation for texlive-urwchancal"
LICENSE = "LPPL-1.0"

PV = "2023.209.1svn21701"

RPM_NAME = "texlive-urwchancal-doc-2023.209.1svn21701-54.1.noarch.rpm"
RPM_HASH = "274decb782d93caf1e22aeffb8aca1c7745ef442585c848f84a009f9c0a0e6f1417e97d6fb682bfcbc6b7012071f992df09eac9307f45108f8460a5c51ab4b80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-urwchancal-doc"

RDEPENDS:${PN} += ""

inherit rpm
