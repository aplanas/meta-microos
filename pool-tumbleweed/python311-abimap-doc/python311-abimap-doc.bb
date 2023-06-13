SUMMARY = "Symbol versioning helper (Documentation)"
DESCRIPTION = "Documentation for the symbol versioning helper python311-abimap"
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python311-abimap-doc-0.3.2-3.10.noarch.rpm"
RPM_HASH = "60baa70d5f425f19ae75a5796ae32ee4afa931dbf79db931e58ba0bc103a90507bc593af594ec7098379cc149b581a6a9cdcf2d474d23c272c5b0d6cc7cd0a36"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python311-abimap-doc"

RDEPENDS:${PN} += ""

inherit rpm
