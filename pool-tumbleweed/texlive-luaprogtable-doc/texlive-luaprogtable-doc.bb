SUMMARY = "Documentation for texlive-luaprogtable"
DESCRIPTION = "This package includes the documentation for texlive-luaprogtable"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn56113"

RPM_NAME = "texlive-luaprogtable-doc-2023.201.1.0svn56113-52.1.noarch.rpm"
RPM_HASH = "bbac20a34657976b1995f8b2c681ff7a5d314a530cb3908a596d8d962580e9de0f78dca469db12f1816dfe32febd540db5b3bb2ec907e6d02c3b4f60b58ffbd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-luaprogtable-doc"
RDEPENDS:${PN} += ""

inherit rpm
