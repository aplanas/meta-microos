SUMMARY = "Documentation for texlive-bithesis"
DESCRIPTION = "This package includes the documentation for texlive-bithesis"
LICENSE = "LPPL-1.0"

PV = "2023.209.3.4.2svn66366"

RPM_NAME = "texlive-bithesis-doc-2023.209.3.4.2svn66366-53.1.noarch.rpm"
RPM_HASH = "6366058272c44429252e7d334da8e8781a90f9f2ec9dd4e60b3520b5d8c17fa362b7a59e7806762c06820bbe981602b3577747f4139131f3e53753523d33adfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-texlive-bithesis-doc-zh \
texlive-bithesis-doc"

RDEPENDS:${PN} += ""

inherit rpm
