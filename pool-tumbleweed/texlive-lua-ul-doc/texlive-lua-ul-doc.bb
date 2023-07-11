SUMMARY = "Documentation for texlive-lua-ul"
DESCRIPTION = "This package includes the documentation for texlive-lua-ul"
LICENSE = "LPPL-1.0"

PV = "2023.208.0.0.2.0svn63469"

RPM_NAME = "texlive-lua-ul-doc-2023.208.0.0.2.0svn63469-53.1.noarch.rpm"
RPM_HASH = "dfc72bd7f4f2ae9266a2fbd3503b461604a90194bc469038e4a9619265883b21e8c2309beac81b91710d51c27cef2c85053c9dcfa850f436c80505d631fc9801"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-lua-ul-doc"

RDEPENDS:${PN} += ""

inherit rpm
