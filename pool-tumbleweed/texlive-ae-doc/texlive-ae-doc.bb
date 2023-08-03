SUMMARY = "Documentation for texlive-ae"
DESCRIPTION = "This package includes the documentation for texlive-ae"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.4svn15878"

RPM_NAME = "texlive-ae-doc-2023.209.1.4svn15878-55.1.noarch.rpm"
RPM_HASH = "77d6cd51ba8bfb16abc712bcd2b1fd48b857c0345a670b5ffcd347d16d4290ed70f78ffc4f32ce2f8b3b91ae094c155eb3c43b997bf369ae8fd18bb9dda25552"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-ae-doc"

RDEPENDS:${PN} += ""

inherit rpm
