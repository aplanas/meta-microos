SUMMARY = "Development Files for OpenSCAP"
DESCRIPTION = "This package contains the development files (mainly C header files) for the \
OpenSCAP C library."
LICENSE = "LGPL-2.1-or-later"

PV = "1.3.8"

RPM_NAME = "openscap-devel-1.3.8-1.1.aarch64.rpm"
RPM_HASH = "013a90d2795a1f0fc9ec033d0259d4318cb733952113b50dbfe7f6434ef58331067e0b184d20d4ce480ccd2b004755953268bce8aba2bf82bb9f8b5c066d00a8"

RPROVIDES:${PN} += "openscap-devel \
pkgconfig-libopenscap"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopenscap25 \
openscap"

inherit rpm
