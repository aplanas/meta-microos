SUMMARY = "Documentation for texlive-oplotsymbl"
DESCRIPTION = "This package includes the documentation for texlive-oplotsymbl"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.4svn44951"

RPM_NAME = "texlive-oplotsymbl-doc-2023.201.1.4svn44951-54.1.noarch.rpm"
RPM_HASH = "1d6c5a9e5f6889cfaf22a437da6d44f509ced60090ead6d3587b91bded70c3efcadfb9ea84ad23e4e57af9f2b621a652c6c6a4696a8c7c4ea2f82316e70d4a42"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-oplotsymbl-doc"

RDEPENDS:${PN} += ""

inherit rpm
