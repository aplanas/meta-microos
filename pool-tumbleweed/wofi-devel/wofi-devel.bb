SUMMARY = "Development files for wofi"
DESCRIPTION = "Headers for the wofi API which are needed to build wofi plugins."
LICENSE = "GPL-3.0-only"

PV = "1.3"

RPM_NAME = "wofi-devel-1.3-1.4.aarch64.rpm"
RPM_HASH = "caa88a458ec55a1d78cfb938bcedd3ebd79ffd7d1cec24b1d632d62c89449fbfcee27a6bb2ce4d74451fc0ee0aa652e1dcb4c89d8728d3126acfaae73124ad8a"

RPROVIDES:${PN} += "pkgconfig-wofi \
wofi-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig-wayland-client \
wofi"

inherit rpm
