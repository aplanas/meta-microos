SUMMARY = "Documentation for texlive-easylist"
DESCRIPTION = "This package includes the documentation for texlive-easylist"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.3svn32661"

RPM_NAME = "texlive-easylist-doc-2023.209.1.3svn32661-54.2.noarch.rpm"
RPM_HASH = "87fb064177048f4c2984565f158d3b27836df35dda3f79c55c9a74a4d0a982e20fa6017e0bc0ebc887d9d89d379378b4b12651b58d3b968b37bae0bdf40718a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-easylist-doc"

RDEPENDS:${PN} += ""

inherit rpm
