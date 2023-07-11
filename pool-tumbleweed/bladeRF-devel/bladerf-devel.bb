SUMMARY = "Development files for libbladeRF"
DESCRIPTION = "Libraries and header files for developing applications that want to make \
use of libbladerf."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only"

PV = "2023.02"

RPM_NAME = "bladeRF-devel-2023.02-16.4.aarch64.rpm"
RPM_HASH = "fe029058a4cd9bbe324ba81efe911028aaeeb71adbb0218a7e9d22c349a34d61b6e5f576f1162bd6f6dabe0c957026a6694b5074ca80ff5862a9578a3bcfdc49"

RPROVIDES:${PN} += "bladeRF-devel \
pkgconfig-libbladeRF"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbladeRF2"

inherit rpm
