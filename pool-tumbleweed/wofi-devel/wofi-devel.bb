SUMMARY = "Development files for wofi"
DESCRIPTION = "Headers for the wofi API which are needed to build wofi plugins."
LICENSE = "GPL-3.0-only"

PV = "1.3"

RPM_NAME = "wofi-devel-1.3-1.3.aarch64.rpm"
RPM_HASH = "dc61ad2228d2644884bbc43520c387a96a50f8295e578c064cc4e6bb4ffc94b01e233ac7ad0a2c24f1c33c5325e58bfc9e456c8337bdfcab4ffd3c7f08ec7198"

RPROVIDES:${PN} += "pkgconfig(wofi) \
wofi-devel \
wofi-devel(aarch-64)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig(wayland-client) \
wofi"

inherit rpm
