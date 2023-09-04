SUMMARY = "Development package for fsverity-utils"
DESCRIPTION = "Development package for fsverity-utils, including libfsverity header \
and library files."
LICENSE = "MIT"

PV = "1.5"

RPM_NAME = "fsverity-utils-devel-1.5-1.1.aarch64.rpm"
RPM_HASH = "bf063d262ec311f7cf73a073b4057037c9366778ae88946230048fc2cf866f354f27ac97f0256ebb27ed16624a6f0e8be6859ea731afdbc42bf7b1f56a7431df"

RPROVIDES:${PN} += "fsverity-utils-devel \
pkgconfig-libfsverity"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfsverity0 \
pkgconfig-libcrypto"

inherit rpm
