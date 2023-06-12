SUMMARY = "Documentation for lua54-luasocket"
DESCRIPTION = "This subpackage contains documentation for lua54-luasocket."
LICENSE = "MIT"

PV = "3.1.0"

RPM_NAME = "lua54-luasocket-doc-3.1.0-2.2.noarch.rpm"
RPM_HASH = "64c152850f958a9956400df6e4aa9b36ca114615ad7d80df55e8eef8db1d1f7ca734687e0b203ca43eea48697a273655e0919953bb3712ebc5bb2f036109de40"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lua54-luasocket-doc"
RDEPENDS:${PN} += ""

inherit rpm
