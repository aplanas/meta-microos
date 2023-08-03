SUMMARY = "Documentation for texlive-everypage"
DESCRIPTION = "This package includes the documentation for texlive-everypage"
LICENSE = "LPPL-1.0"

PV = "2023.209.2.0bsvn56694"

RPM_NAME = "texlive-everypage-doc-2023.209.2.0bsvn56694-53.1.noarch.rpm"
RPM_HASH = "46daf3f5818bc832ca3d7508d08a44f70d5b5f51b14268d2e8248eb23d2232b08815b105efb01b7ccbc236df75f02baa70f94416227697721163431f1b846255"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "texlive-everypage-doc"

RDEPENDS:${PN} += ""

inherit rpm
