SUMMARY = "Development files for libqtolm"
DESCRIPTION = "The libqtolm-devel package contains libraries and header files for \
developing applications that use libqtolm."
LICENSE = "GPL-3.0-only"

PV = "3.0.1"

RPM_NAME = "libqtolm-devel-3.0.1-1.10.aarch64.rpm"
RPM_HASH = "0dafd08d7edf3d711e596e0505e811e21e2c4a3eff4f9860df6bf0dbb989d332dcad936b5920f6a0ae1555dba05db12b807e15e6e121a1de8ee7a80cb3951609"

RPROVIDES:${PN} += "cmake(QtOlm) \
libqtolm-devel \
libqtolm-devel(aarch-64) \
pkgconfig(QtOlm)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libQtOlm3_0"

inherit rpm
