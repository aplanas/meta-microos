SUMMARY = "Documentation for fontconfig"
DESCRIPTION = "Extended documentation for the fontconfig library."
LICENSE = "MIT"

PV = "2.14.2"

RPM_NAME = "fontconfig-doc-2.14.2-1.3.noarch.rpm"
RPM_HASH = "bc961c9dc19fd398f57f2535a0a9c47154d3736b338ca83fb5460e9e56e1ced35a47019527316ffeca2bb03e8bef3a753ebe095c765713d1718d30f9b723c9c7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "fontconfig-doc"

RDEPENDS:${PN} += ""

inherit rpm
