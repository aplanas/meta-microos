SUMMARY = "Development files for libbladeRF"
DESCRIPTION = "Libraries and header files for developing applications that want to make \
use of libbladerf."
LICENSE = "AGPL-3.0-or-later & GPL-2.0-only"

PV = "2023.02"

RPM_NAME = "bladeRF-devel-2023.02-16.3.aarch64.rpm"
RPM_HASH = "2bc3e30ed482ea9be17c13c7d9029b39ae7b20bbd53c241e174b7deb81d9fa74823a25f74850eadca6203766d6b680abf839dd061b788e97ef6fa7c0356af084"

RPROVIDES:${PN} += "bladeRF-devel \
bladeRF-devel(aarch-64) \
pkgconfig(libbladeRF)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbladeRF2"

inherit rpm
