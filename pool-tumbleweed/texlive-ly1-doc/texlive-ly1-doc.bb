SUMMARY = "Documentation for texlive-ly1"
DESCRIPTION = "This package includes the documentation for texlive-ly1"
LICENSE = "LPPL-1.0"

PV = "2023.201.svn63565"

RPM_NAME = "texlive-ly1-doc-2023.201.svn63565-52.1.noarch.rpm"
RPM_HASH = "4b1cddf6a8c4fb728c5fceca06eee47564b9f0d6d43311767738e3e705f9498c0aab95a143b1ded416815ef2da86fbe9e4102f5292718d1f82907a117b0c4903"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ly1-doc"

RDEPENDS:${PN} += ""

inherit rpm
