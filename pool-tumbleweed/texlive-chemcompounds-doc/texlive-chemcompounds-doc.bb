SUMMARY = "Documentation for texlive-chemcompounds"
DESCRIPTION = "This package includes the documentation for texlive-chemcompounds"
LICENSE = "LPPL-1.0"

PV = "2023.209.svn15878"

RPM_NAME = "texlive-chemcompounds-doc-2023.209.svn15878-54.1.noarch.rpm"
RPM_HASH = "f04a2222a4ce433a35b2886c9eb4bbdeebb325f4252bfd515b88151f6d0526460f0ef0cb6c19e2649a485c11da7baf8c91e2516422975659cf18314f578fa1b7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-chemcompounds-doc"

RDEPENDS:${PN} += ""

inherit rpm
