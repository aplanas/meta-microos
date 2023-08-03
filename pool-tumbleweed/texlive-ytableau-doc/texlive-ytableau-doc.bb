SUMMARY = "Documentation for texlive-ytableau"
DESCRIPTION = "This package includes the documentation for texlive-ytableau"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn59580"

RPM_NAME = "texlive-ytableau-doc-2023.209.1.4svn59580-53.1.noarch.rpm"
RPM_HASH = "108bad6108a8c50a66a47dd45219a8dc41cf1d2e95b788ab66f2c147c3664f56bf4d7cbd5d16b03aaa5f806baae2e80d416bbfeb3fec4e8881b852087329d771"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ytableau-doc"

RDEPENDS:${PN} += ""

inherit rpm
