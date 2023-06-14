SUMMARY = "Development package for ibus-table-extraphrase"
DESCRIPTION = "This package contains the files required for the development of \
ibus-table-extraphrase."
LICENSE = "GPL-3.0-or-later"

PV = "1.3.9.20110826"

RPM_NAME = "ibus-table-extraphrase-devel-1.3.9.20110826-9.9.noarch.rpm"
RPM_HASH = "9c5ebea977726af7ee02e8e82c3289885b969657d2a45ad873b5c61c5d70f906cb4ddc2132fdbad9a2f1379e0b542c627e5d057a023216c7b5f1ede527907240"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ibus-table-extraphrase-devel \
pkgconfig-ibus-table-extraphrase"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
ibus-table-extraphrase \
pkgconfig-ibus-table"

inherit rpm
