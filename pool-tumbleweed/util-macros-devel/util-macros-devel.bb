SUMMARY = "The X Protocol"
DESCRIPTION = "Utility Macro Headers for X development"
LICENSE = "HPND"

PV = "1.20.0"

RPM_NAME = "util-macros-devel-1.20.0-1.4.aarch64.rpm"
RPM_HASH = "90d5dc3306d5a0c07c322d4ddb31e8c3b652ae0929d94647dc5c376c4f1e32162f9b27324de54d88a649e1a6967f6179dc30c6e73ffd9fccb1f88dd96e3d4e4c"

RPROVIDES:${PN} += "pkgconfig-xorg-macros \
util-macros-devel \
xorg-x11-proto-devel-//usr/lib64/pkgconfig/xorg-macros.pc"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
