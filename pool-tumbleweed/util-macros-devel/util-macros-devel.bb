SUMMARY = "The X Protocol"
DESCRIPTION = "Utility Macro Headers for X development"
LICENSE = "HPND"

PV = "1.20.0"

RPM_NAME = "util-macros-devel-1.20.0-1.3.aarch64.rpm"
RPM_HASH = "7eaa684f93233b57daa24636492cf7ee6b71cf43e7e0e468959b140c174f935625f73e3da5d3367613f7961ccd1f6e29ba66fb222e5e4153bceaea27b842cb14"

RPROVIDES:${PN} += "pkgconfig-xorg-macros \
util-macros-devel \
xorg-x11-proto-devel-//usr/lib64/pkgconfig/xorg-macros.pc"

RDEPENDS:${PN} += "/usr/bin/pkg-config"

inherit rpm
