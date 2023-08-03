SUMMARY = "Documentation for texlive-bibleref-lds"
DESCRIPTION = "This package includes the documentation for texlive-bibleref-lds"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn25526"

RPM_NAME = "texlive-bibleref-lds-doc-2023.209.1.0svn25526-54.1.noarch.rpm"
RPM_HASH = "565e17dc49f2041023460d92e9cd0e3368f4d94e8e9d642793a02fb70543a3b6a315d209b12ddc7ecdb0b30612c508fbcf0c31bee1d9effaba8fbf992fabf237"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-bibleref-lds-doc"

RDEPENDS:${PN} += ""

inherit rpm
