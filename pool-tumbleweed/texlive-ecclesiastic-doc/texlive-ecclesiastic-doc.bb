SUMMARY = "Documentation for texlive-ecclesiastic"
DESCRIPTION = "This package includes the documentation for texlive-ecclesiastic"
LICENSE = "LPPL-1.0"

PV = "2023.209.0.0.3svn38172"

RPM_NAME = "texlive-ecclesiastic-doc-2023.209.0.0.3svn38172-54.1.noarch.rpm"
RPM_HASH = "cbba1a2f38ed78f1c8c76862ae6ce9d382ce3c9bceb506c927b1441190d256af5e787882cc483073a907078fd67f6ef0cd8fa52be9cccf8241dedd14ec18f540"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ecclesiastic-doc"

RDEPENDS:${PN} += ""

inherit rpm
