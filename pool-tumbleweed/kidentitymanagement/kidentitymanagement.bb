SUMMARY = "KDE PIM Libraries: Identity Management"
DESCRIPTION = "This package provides a library to handle multiple email identities and \
associated settings."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "kidentitymanagement-23.04.1-1.1.aarch64.rpm"
RPM_HASH = "59265e74e55d54117b6ea8e4f8fed44010e6e68d1f5432cbf06ed1169425a92aea023fb5f593382a218fcd620d5af70f9e8e6e4654d305b5ea831b6b8d9e69c7"

RPROVIDES:${PN} += "kidentitymanagement"

RDEPENDS:${PN} += ""

inherit rpm
