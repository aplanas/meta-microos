SUMMARY = "Utilities for core application functionality and accessing the OS"
DESCRIPTION = "KCoreAddons provides classes built on top of QtCore to perform various tasks \
such as manipulating mime types, autosaving files, creating backup files, \
generating random sequences, performing text manipulations such as macro \
replacement, accessing user information and many more."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "kcoreaddons-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "b30c9243e82ff622c12ac59154941792e05228ecc46d6c3223a99e9d101e3357b7dbfd020a0c6ec426c741e2e61e8f9532183931388ebdbc7fc30ed41940dfbd"

RPROVIDES:${PN} += "kcoreaddons"

RDEPENDS:${PN} += "shared-mime-info"

inherit rpm
