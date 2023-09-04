SUMMARY = "Utilities for core application functionality and accessing the OS"
DESCRIPTION = "KCoreAddons provides classes built on top of QtCore to perform various tasks \
such as manipulating mime types, autosaving files, creating backup files, \
generating random sequences, performing text manipulations such as macro \
replacement, accessing user information and many more."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "kcoreaddons-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "0551dd5ab675c55b695188fadb6ceac97ed51dff08fe19a694d9676dad48c5dcf9c5da733f414ccca1b57b4b5e545051ee66aff94ecc2f81f21875041f785d5c"

RPROVIDES:${PN} += "kcoreaddons"

RDEPENDS:${PN} += "shared-mime-info"

inherit rpm
