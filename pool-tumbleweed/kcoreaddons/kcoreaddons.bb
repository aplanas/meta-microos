SUMMARY = "Utilities for core application functionality and accessing the OS"
DESCRIPTION = "KCoreAddons provides classes built on top of QtCore to perform various tasks \
such as manipulating mime types, autosaving files, creating backup files, \
generating random sequences, performing text manipulations such as macro \
replacement, accessing user information and many more."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kcoreaddons-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "7ed28cb1ea1840d759a2dc657d3bf73abc159d0aa55ba9e4dcce1b2c9630de7d1979f33218291ac5b80fef76bc5c2116457658b5d23e59cbfcb053c57b5ed05d"

RPROVIDES:${PN} += "kcoreaddons"

RDEPENDS:${PN} += "shared-mime-info"

inherit rpm
