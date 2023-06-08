SUMMARY = "Development files for libcrossguid"
DESCRIPTION = "The crossguid-devel package contains libraries and header files for \
developing applications that use libcrossguid."
LICENSE = "MIT"

PV = "0.2.2.20190529T083634.ca1bf4b"

RPM_NAME = "crossguid-devel-0.2.2.20190529T083634.ca1bf4b-2.1.aarch64.rpm"
RPM_HASH = "55b88d6d4db8a35bcd05a983bbed8d24735930f18c0ef679da26ce8d7102b6196abcf6b1ad0615e1470105a8ac99d331dca9ff3e39ad857fe305e9ec0b0f9046"

RPROVIDES:${PN} += "crossguid-devel crossguid-devel(aarch-64) pkgconfig(crossguid)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcrossguid0"

inherit rpm
