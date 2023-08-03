SUMMARY = "Sonivox library - Development files"
DESCRIPTION = "Development files for the sonivox library."
LICENSE = "Apache-2.0"

PV = "3.6.12"

RPM_NAME = "sonivox-devel-3.6.12-1.1.aarch64.rpm"
RPM_HASH = "7828b9b34407dbd4d4a64ed5585b2715d91c86311b5de2ccfad4be40b1d7395c9c80e0b6587d4cdd46c406f74e7c0c9e8861d56b97da5c9a529774be761494fe"

RPROVIDES:${PN} += "cmake-sonivox \
pkgconfig-sonivox \
sonivox-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libsonivox3"

inherit rpm
