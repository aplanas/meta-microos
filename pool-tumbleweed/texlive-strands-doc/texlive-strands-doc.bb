SUMMARY = "Documentation for texlive-strands"
DESCRIPTION = "This package includes the documentation for texlive-strands"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn59906"

RPM_NAME = "texlive-strands-doc-2023.209.1.1svn59906-58.1.noarch.rpm"
RPM_HASH = "f7f37e62fd38cf77654f1873d5a48ce0b306d7ae3b840f034097f0e757238445bd58fc2a9b04d1fefba5f825714e93ac2176fb5e0b18e94154856847e064df6b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-strands-doc"

RDEPENDS:${PN} += ""

inherit rpm
