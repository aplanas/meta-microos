SUMMARY = "Documentation for python-beautifulsoup4"
DESCRIPTION = "Documentation and help files for python-beautifulsoup4"
LICENSE = "MIT"

PV = "4.12.2"

RPM_NAME = "python-beautifulsoup4-doc-4.12.2-1.1.noarch.rpm"
RPM_HASH = "14bbb31c78dd01cf372d561aaca61176bce9e4393edfb6824b04c650162ec69e171dcbe02e8fbc2ceca60efcdb8ffef55e4c05efe94b699abb8b1c6873213518"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python-beautifulsoup4-doc"

RDEPENDS:${PN} += ""

inherit rpm
