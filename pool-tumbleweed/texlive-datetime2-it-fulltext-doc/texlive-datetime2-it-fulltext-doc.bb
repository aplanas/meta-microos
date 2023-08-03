SUMMARY = "Documentation for texlive-datetime2-it-fulltext"
DESCRIPTION = "This package includes the documentation for texlive-datetime2-it-fulltext"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.6svn54779"

RPM_NAME = "texlive-datetime2-it-fulltext-doc-2023.209.1.6svn54779-53.1.noarch.rpm"
RPM_HASH = "d07c5d9ab8eb0566184544644db13593dad9f692200c46f52f4008e6bd02b786f06ea92d8e6558f83833726c58c3d0480221c8ceafc64e9190866a014ebcfa80"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-datetime2-it-fulltext-doc"

RDEPENDS:${PN} += ""

inherit rpm
