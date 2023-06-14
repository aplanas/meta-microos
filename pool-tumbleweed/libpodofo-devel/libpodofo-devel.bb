SUMMARY = "Development files for podofo"
DESCRIPTION = "This package contains development files for podofo library."
LICENSE = "LGPL-2.1-or-later"

PV = "0.9.8"

RPM_NAME = "libpodofo-devel-0.9.8-1.10.aarch64.rpm"
RPM_HASH = "6886e7fc67257c202621fd4de1de75bc860fd8bb7d042fa193d84b36baac9bfc5d54a1d954e422799275e9cf03188c95a3c6f9bb658174030c4da628e6c292b2"

RPROVIDES:${PN} += "libpodofo-devel \
pkgconfig-libpodofo"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libboost-headers-devel \
libpodofo0-9-8"

inherit rpm
