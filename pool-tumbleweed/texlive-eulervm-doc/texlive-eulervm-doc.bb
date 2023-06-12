SUMMARY = "Documentation for texlive-eulervm"
DESCRIPTION = "This package includes the documentation for texlive-eulervm"
LICENSE = "LPPL-1.0"

PV = "2023.201.4.0svn15878"

RPM_NAME = "texlive-eulervm-doc-2023.201.4.0svn15878-52.1.noarch.rpm"
RPM_HASH = "fe4ff27656ff09173c8c1f58297cd9d4ba4467cfae74567cfdb04367956d07a7c00991f978112d7e24f5be2a7e978a13d37f2fdb4d9e1d62d071e8681aab769a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-eulervm-doc"
RDEPENDS:${PN} += ""

inherit rpm
