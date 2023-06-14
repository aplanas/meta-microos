SUMMARY = "Library to work with PKCS#11 modules -- Development Files"
DESCRIPTION = "p11-kit provides a way to load and enumerate PKCS#11 modules, as well \
as a standard configuration setup for installing PKCS#11 modules in \
such a way that they're discoverable."
LICENSE = "BSD-3-Clause"

PV = "0.24.1"

RPM_NAME = "p11-kit-devel-0.24.1-2.3.aarch64.rpm"
RPM_HASH = "21190bf2417fc9dc0c5eb2bac3002c1be36f5cdf60152c5398d292405d2e142bcd162fcb1f47bb3ad4b92c2c45f5aaffdb44e87cdb21c1a7dd0d8b6e855438d3"

RPROVIDES:${PN} += "p11-kit-devel \
pkgconfig-p11-kit-1 \
rpm-macro-pkidir-cfg \
rpm-macro-pkidir-static \
rpm-macro-trustdir-cfg \
rpm-macro-trustdir-static"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libp11-kit0"

inherit rpm
