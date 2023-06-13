SUMMARY = "Development files for ngspice"
DESCRIPTION = "Ngspice is a mixed-level/mixed-signal circuit simulator. Its code \
is based on three open source software packages: Spice3f5, Cider1b1 \
and Xspice. This package contains the development files."
LICENSE = "BSD-2-Clause"

PV = "40"

RPM_NAME = "libngspice-devel-40-1.1.aarch64.rpm"
RPM_HASH = "d52c1dcf86196ce251ca07e2384468a64bedffff59b4da2fb2c9cf6cc46bd92dbc18c78eb2b6845c980ab8c943b319469eba2e38b0fe126ffc7770e29c23ebb6"

RPROVIDES:${PN} += "libngspice-devel \
libngspice-devel(aarch-64) \
pkgconfig(ngspice)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libngspice0"

inherit rpm
