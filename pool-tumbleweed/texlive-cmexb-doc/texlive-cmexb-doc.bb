SUMMARY = "Documentation for texlive-cmexb"
DESCRIPTION = "This package includes the documentation for texlive-cmexb"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn54074"

RPM_NAME = "texlive-cmexb-doc-2023.209.svn54074-54.1.noarch.rpm"
RPM_HASH = "69a96c105107476ce3617ccf3bb5c6c71dcc938fef400ee377ad84836332309fe428525fe7f3fdc96418f39473b5ae162e02177c95f8ddad8f572fb27a64336c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-cmexb-doc"

RDEPENDS:${PN} += ""

inherit rpm
