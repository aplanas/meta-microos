SUMMARY = "Symbol versioning helper (Documentation)"
DESCRIPTION = "Documentation for the symbol versioning helper python310-abimap"
LICENSE = "MIT"

PV = "0.3.2"

RPM_NAME = "python310-abimap-doc-0.3.2-3.10.noarch.rpm"
RPM_HASH = "35c699d400b217bd3653b7868a72612f399c88ad13b1de98836f3c6ad8c2b13856bb7e6e6c24e68d523c7d1308965b8200cbaa60be995ddf0125106f59f78e98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-abimap-doc \
python310-abimap-doc"
RDEPENDS:${PN} += ""

inherit rpm
