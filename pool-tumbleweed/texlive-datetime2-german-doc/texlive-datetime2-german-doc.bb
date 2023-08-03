SUMMARY = "Documentation for texlive-datetime2-german"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-german"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.0svn53125"

RPM_NAME = "texlive-datetime2-german-doc-2023.209.3.0svn53125-53.1.noarch.rpm"
RPM_HASH = "594d80a88f72e664e2cb5c09c76a9e8096f00fcd987f85a1403fe9fe8c6277e115942a056aedef6c55d96d213192c6c00cd5e8f6090fd3745f87ace0002c3210"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-german-doc"

RDEPENDS:${PN} += ""

inherit rpm
