SUMMARY = "SPICE-protocol definitions"
DESCRIPTION = "Headers defining the SPICE-protocol"
LICENSE = "BSD-3-Clause"

PV = "0.14.4"

RPM_NAME = "spice-protocol-devel-0.14.4-2.2.noarch.rpm"
RPM_HASH = "1c402ba1a33de14f1e224617e01c80c37ef029b201b7c95debdbe432402e30e65578ae712a34c7602dd7c8486aeb5de6bc336c503ab1e51f71ccadbc75258d76"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "pkgconfig-spice-protocol \
spice-protocol-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
