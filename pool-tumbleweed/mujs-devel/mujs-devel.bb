SUMMARY = "MuJS development files"
DESCRIPTION = "This package provides the MuJS static library."
LICENSE = "AGPL-3.0-or-later"

PV = "1.3.3"

RPM_NAME = "mujs-devel-1.3.3-1.1.aarch64.rpm"
RPM_HASH = "3fe8205333848f2a7a6f28f4eb1b7dc95d7295569893cc61fd50e3b29e91f96dfc1fe2604a1584477eb4e425bf34e3a0c381bdfb600855492dcb9c755b0900ad"

RPROVIDES:${PN} += "mujs-devel \
mujs-devel(aarch-64) \
mujs-static \
pkgconfig(mujs)"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
