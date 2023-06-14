SUMMARY = "Development files for libirman"
DESCRIPTION = "libirman is a general purpose library for programs to use in order to \
receive infrared signals via irman-compatible hardware. \
 \
Devel files for libirman from the lirc project."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.2"

RPM_NAME = "libirman-devel-0.5.2-5.12.aarch64.rpm"
RPM_HASH = "2dc54df8b6147d5bb7d052212778aa8dc22e1c3294b7c3af3e79d2451eda1d0f0ccb41d6ebb13ac6b23bc05ec34c5176c9ee9dd4577a0ca274c28275d399ec78"

RPROVIDES:${PN} += "libirman-devel \
pkgconfig-libirman"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libirman0"

inherit rpm
