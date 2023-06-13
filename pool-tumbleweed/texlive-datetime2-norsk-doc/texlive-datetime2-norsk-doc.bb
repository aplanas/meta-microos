SUMMARY = "Documentation for texlive-datetime2-norsk"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-norsk"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.1svn48267"

RPM_NAME = "texlive-datetime2-norsk-doc-2023.201.1.1svn48267-52.1.noarch.rpm"
RPM_HASH = "e73c45fd12e322e54893b18b437b1cb9742cd4228cb87460223bb484d5f49274fe0ddbe9f8e5bcfae9156fb732143135774c6d434f9416bc55cccb36dd66fd94"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-norsk-doc"

RDEPENDS:${PN} += ""

inherit rpm
