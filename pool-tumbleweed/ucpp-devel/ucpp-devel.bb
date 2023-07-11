SUMMARY = "Files for Developing with ucpp"
DESCRIPTION = "Includes and definitions for developing with the ucpp library."
LICENSE = "BSD-3-Clause"

PV = "1.3.5"

RPM_NAME = "ucpp-devel-1.3.5-2.19.aarch64.rpm"
RPM_HASH = "ad9afb12ce9c16a4bf23fbafc428641bc7400af76882ed734dae8e6762f551b26513ff1cf166a0ddfa4865a995943a1a60b93d3ede06003f351bf9641e741f49"

RPROVIDES:${PN} += "pkgconfig-libucpp \
ucpp-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libucpp13"

inherit rpm
