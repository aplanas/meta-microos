SUMMARY = "Cryptsetup Documentation"
DESCRIPTION = "Documentation and man pages for cryptsetup"
LICENSE = "LGPL-2.0-or-later & SUSE-GPL-2.0-with-openssl-exception"

PV = "2.6.1"

RPM_NAME = "cryptsetup-doc-2.6.1-3.1.noarch.rpm"
RPM_HASH = "0ac71d64dd27ffe4522717d2c32d40a875a78c32ea5abc7d91aa12c91573fa849cca81ce9c15e78cfae9f3c102a416ebc9e9e6ee8d895973eb52b64ba26d5e01"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cryptsetup-doc"

RDEPENDS:${PN} += ""

inherit rpm
