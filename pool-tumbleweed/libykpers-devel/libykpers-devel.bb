SUMMARY = "Development files for the ykpers library"
DESCRIPTION = "Yubico's YubiKey can be re-programmed. This project provides a reference implementation for configuration of YubiKeys."
LICENSE = "BSD-2-Clause"

PV = "1.20.0"

RPM_NAME = "libykpers-devel-1.20.0-3.8.aarch64.rpm"
RPM_HASH = "c3ea2b26db9f2e9b35390b31df1c6b54d6f55fe5a4157f734007f683f41c7c3aafec6182f5728c7ee24849c4480c48dad3dab9c90f5dc9403d2db862b5268e53"

RPROVIDES:${PN} += "libykpers-devel \
pkgconfig-ykpers-1"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libykpers-1-1"

inherit rpm
