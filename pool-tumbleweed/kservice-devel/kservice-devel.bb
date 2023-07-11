SUMMARY = "Plugin framework for desktop services: Build Environment"
DESCRIPTION = "Provides a plugin framework for handling desktop services. Services can \
be applications or libraries. They can be bound to MIME types or handled by \
application specific code. Development files"
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "kservice-devel-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "1e289fb1ef0b056de520622b3d34fc83f1c056b3c7bfa63b155a3c806d03b5fac6a574112363015c751b2173968080edbc1f393684a7e75b152619ac37b333be"

RPROVIDES:${PN} += "cmake-KF5Service \
kservice-devel"

RDEPENDS:${PN} += "cmake-KF5Config \
cmake-KF5CoreAddons \
extra-cmake-modules \
kservice"

inherit rpm
