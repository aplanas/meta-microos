SUMMARY = "Documentation for texlive-nucleardata"
DESCRIPTION = "This package includes the documentation for texlive-nucleardata"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.1svn47307"

RPM_NAME = "texlive-nucleardata-doc-2023.209.1.1svn47307-55.1.noarch.rpm"
RPM_HASH = "702e2ce05d4e3997ae1f741d0e717834a8db2c8108f32bca7a07e76ebd3e8a4876c2613090b9f31daa60aaa65a7c3fabcae7972bbb1075c690d6c6b465d5f8d2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-nucleardata-doc"

RDEPENDS:${PN} += ""

inherit rpm
