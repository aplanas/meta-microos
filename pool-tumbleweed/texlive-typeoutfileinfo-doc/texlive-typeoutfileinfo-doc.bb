SUMMARY = "Documentation for texlive-typeoutfileinfo"
DESCRIPTION = "This package includes the documentation for texlive-typeoutfileinfo"
LICENSE = "LPPL-1.0"

PV = "2023.201.0.0.31svn29349"

RPM_NAME = "texlive-typeoutfileinfo-doc-2023.201.0.0.31svn29349-52.1.noarch.rpm"
RPM_HASH = "bfb6df3f302e4d1cb4d674ee75181b02de63646e6a7d3611052abc5ccd0d11ea2ef5d073fa2423ab50ae5f4a39c61449ff0e1358b8c4b845e5536af9d8b6bff1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-typeoutfileinfo-doc"

RDEPENDS:${PN} += ""

inherit rpm
