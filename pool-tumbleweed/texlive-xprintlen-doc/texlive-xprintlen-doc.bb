SUMMARY = "Documentation for texlive-xprintlen"
DESCRIPTION = "This package includes the documentation for texlive-xprintlen"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn35928"

RPM_NAME = "texlive-xprintlen-doc-2023.209.1.0svn35928-53.1.noarch.rpm"
RPM_HASH = "ced5892c1b17bdef037c792e003ca3f8052d167e37d48f5b5712a0bb8a0ac55fc9cbd90ad3ca62544317afc1a0a046954cc96d1e34bb042299cf4ec3a156e107"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-xprintlen-doc"

RDEPENDS:${PN} += ""

inherit rpm
