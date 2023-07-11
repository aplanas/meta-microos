SUMMARY = "Documentation for CKermit"
DESCRIPTION = "This package contains the documentation and manual pages for ckermit"
LICENSE = "BSD-3-Clause"

PV = "9.0.302"

RPM_NAME = "ckermit-doc-9.0.302-14.18.noarch.rpm"
RPM_HASH = "7b7e17f5da3a062f9bf6e58dec7351feaea7014b547a89d1753f84ba6f2b527361e6b3f9488382bf63451c379be9c5a4b75a04fcd2ca1951f457e23e70aab6f3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ckermit-doc"

RDEPENDS:${PN} += ""

inherit rpm
