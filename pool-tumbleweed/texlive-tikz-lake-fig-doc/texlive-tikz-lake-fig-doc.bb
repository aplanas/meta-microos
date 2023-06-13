SUMMARY = "Documentation for texlive-tikz-lake-fig"
DESCRIPTION = "This package includes the documentation for texlive-tikz-lake-fig"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn55288"

RPM_NAME = "texlive-tikz-lake-fig-doc-2023.201.1.0svn55288-52.1.noarch.rpm"
RPM_HASH = "fa3da3565c4ef0f4d546c4b5181e3f0cc29a0b2dfe6416bc9c17c2ba3e5a0e054ae3d6c6b0a4d9a1f309ec087c611fefb9009a4ea3a7e149225e2d8087a8b510"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-tikz-lake-fig-doc"

RDEPENDS:${PN} += ""

inherit rpm
