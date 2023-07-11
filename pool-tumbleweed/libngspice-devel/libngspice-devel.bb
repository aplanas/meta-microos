SUMMARY = "Development files for ngspice"
DESCRIPTION = "Ngspice is a mixed-level/mixed-signal circuit simulator. Its code \
is based on three open source software packages: Spice3f5, Cider1b1 \
and Xspice. This package contains the development files."
LICENSE = "BSD-2-Clause"

PV = "40"

RPM_NAME = "libngspice-devel-40-1.2.aarch64.rpm"
RPM_HASH = "391adad755802616170f701559c7d1a9ce44c95ed5df43954d765877d7049bc69bdbd1f32d5e1439815202d214d55ff046a2206f82ccf4c57346d3cdfce59ebc"

RPROVIDES:${PN} += "libngspice-devel \
pkgconfig-ngspice"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libngspice0"

inherit rpm
