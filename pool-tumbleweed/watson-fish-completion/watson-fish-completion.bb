SUMMARY = "Fish completion for watson"
DESCRIPTION = "Fish command line completion support for watson."
LICENSE = "MIT"

PV = "2.1.0"

RPM_NAME = "watson-fish-completion-2.1.0-1.5.noarch.rpm"
RPM_HASH = "e442104fb2c1e2f0e18f77db2df94652390286df9fcf40749bb284fd852685915af5a27bc72db54a81d5d9de6357502ebd7937bb6022a2086bd8c4f97170b404"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "watson-fish-completion"

RDEPENDS:${PN} += "watson"

inherit rpm
