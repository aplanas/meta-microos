SUMMARY = "Documentation for texlive-constants"
DESCRIPTION = "This package includes the documentation for texlive-constants"
LICENSE = "LPPL-1.0"

PV = "2023.209.1.0svn15878"

RPM_NAME = "texlive-constants-doc-2023.209.1.0svn15878-55.1.noarch.rpm"
RPM_HASH = "765b6b8403c5fb3778220af62c172dbfefde2ecd72c7fc6abb40f07cf309f3226f08025436c0429d439dee10cc40199fea70a0e067f745abe910d9060dba5214"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-constants-doc"

RDEPENDS:${PN} += ""

inherit rpm
