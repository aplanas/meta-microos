SUMMARY = "Documentation for texlive-sciposter"
DESCRIPTION = "This package includes the documentation for texlive-sciposter"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.18svn15878"

RPM_NAME = "texlive-sciposter-doc-2023.209.1.18svn15878-54.1.noarch.rpm"
RPM_HASH = "42327a7003835b54e74f685398f3b91a496bfcc0170326424a91da52e050e8cbe11456cd9d79e87fd2bdd4bb1e5b67eaad103a5162a2f73dc70d5029af07cc7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-sciposter-doc"

RDEPENDS:${PN} += ""

inherit rpm
