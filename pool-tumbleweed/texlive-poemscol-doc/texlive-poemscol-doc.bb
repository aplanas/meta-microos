SUMMARY = "Documentation for texlive-poemscol"
DESCRIPTION = "This package includes the documentation for texlive-poemscol"
LICENSE = "LPPL-1.0"

PV = "2023.201.3.1415926svn56082"

RPM_NAME = "texlive-poemscol-doc-2023.201.3.1415926svn56082-52.1.noarch.rpm"
RPM_HASH = "b3430532e8704e051f12636f9a9717d7b80f988971eef043fbf1c26ed27fa490656d71557e9f02de040a44ae79a0a4eddc76d4299ab66da1c6976313026e1dc2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-poemscol-doc"

RDEPENDS:${PN} += ""

inherit rpm
