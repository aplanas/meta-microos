SUMMARY = "Development libraries for nss-shared-helper"
DESCRIPTION = "Header and library files for helpers meant to enable sharing of NSS \
crypto database."
LICENSE = "LGPL-2.1+"

PV = "1.0.10"

RPM_NAME = "nss-shared-helper-devel-1.0.10-9.27.aarch64.rpm"
RPM_HASH = "8b79489797e22e3766201334a732788794f81d546d0c364eb7c9f17bfc8023c41d06b0d372173c0917ac1bb8b38b00515bd548fab431e14640aecb55debbddca"

RPROVIDES:${PN} += "nss-shared-helper-devel \
pkgconfig-nss-shared-helper"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnsssharedhelper0 \
mozilla-nss-devel \
pkgconfig-nss"

inherit rpm
