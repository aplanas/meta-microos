SUMMARY = "Documentation for texlive-glossaries-nynorsk"
DESCRIPTION = "This package includes the documentation for texlive-glossaries-nynorsk"
LICENSE = "LPPL-1.0"

PV = "2023.201.1.0svn55189"

RPM_NAME = "texlive-glossaries-nynorsk-doc-2023.201.1.0svn55189-53.1.noarch.rpm"
RPM_HASH = "70d94d79ac748689e6a8eab7772a1f804905b40c393488cf2999ca4865c1f2c0583b1ce6111f6e09c4d7a5b02405d56708c8faa0e03d0b961076d714ba0cf657"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-glossaries-nynorsk-doc"

RDEPENDS:${PN} += ""

inherit rpm
